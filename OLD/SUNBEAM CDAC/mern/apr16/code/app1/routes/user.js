const express = require('express')
const db = require('../db')
const utils = require('../utils')
const crypto = require('crypto-js')

// import jsonwebtoken for creating JWT token
const jwt = require('jsonwebtoken')
const config = require('../config')

const router = express.Router()

router.post('/login', (request, response) => {
  const { email, password } = request.body
  const statement = `select id, firstName, lastName, isDeleted, phoneNumber from user where email = ? and password = ?`
  const encryptedPassword = String(crypto.SHA256(password))
  db.pool.query(statement, [email, encryptedPassword], (error, users) => {
    if (error) {
      response.send(utils.createErrorResult(error))
    } else {
      if (users.length == 0) {
        response.send(utils.createErrorResult('user does not exist'))
      } else {
        const user = users[0]
        if (user['isDeleted'] == 1) {
          response.send(
            utils.createErrorResult('you have deleted your account')
          )
        } else {
          // create payload for JWT token
          const payload = {
            id: user.id,
          }

          // create token
          const token = jwt.sign(payload, config.secret)

          const userData = {
            name: `${user.firstName} ${user.lastName}`,
            phNumber: user.phoneNumber,
            email,
            token,
          }
          response.send(utils.createSuccessResult(userData))
        }
      }
    }
  })
})

// protected API
// - api which requires the user token
router.get('/profile', (request, response) => {
  // read the token
  const token = request.headers['token']

  // check if the token is non-empty
  if (!token || token.length == 0) {
    response.send(utils.createErrorResult('token missing'))
    return
  }

  // verify and decode the token
  try {
    const payload = jwt.verify(token, config.secret)
    const { id } = payload
    const statement = `select firstName, lastName, email, phoneNumber from user where id = ?`
    db.pool.query(statement, [id], (error, users) => {
      if (error) {
        response.send(utils.createErrorResult(error))
      } else {
        if (users.length == 0) {
          response.send(utils.createErrorResult('user does not exist'))
        } else {
          response.send(utils.createSuccessResult(users[0]))
        }
      }
    })
  } catch (ex) {
    response.send(utils.createErrorResult('invalid token'))
  }
})

// protected API
router.delete('/close', (request, response) => {
  // get the token
  const token = request.headers['token']

  if (!token || token.length == 0) {
    response.send(utils.createErrorResult('missing token'))
    return
  }

  try {
    const payload = jwt.verify(token, config.secret)
    const { id } = payload
    const query = `update user set isDeleted = 1 where id = ?`
    db.pool.execute(query, [id], (error, result) => {
      response.send(utils.createResult(error, result))
    })
  } catch (ex) {
    response.send(utils.createErrorResult('invalid token'))
  }
})

module.exports = router
