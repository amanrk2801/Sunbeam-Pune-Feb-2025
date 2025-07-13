const express = require('express')
const db = require('../db')
const utils = require('../utils')
const crypto = require('crypto-js')

// import mailer
const mailer = require('../mailer')

// import jsonwebtoken for creating JWT token
const jwt = require('jsonwebtoken')
const config = require('../config')

const router = express.Router()

router.post('/register', (request, response) => {
  const { firstName, lastName, email, password, phone } = request.body
  const query = `insert into user (firstName, lastName, email, password, phoneNumber) values (?, ?, ?, ?, ?);`
  db.pool.execute(
    query,
    [firstName, lastName, email, password, phone],
    (error, result) => {
      if (error) {
        response.send(utils.createErrorResult(error))
      } else {
        // send email
        mailer.sendEmail(
          email,
          'Welcome to Airbnb app',
          `
          <h3>Hi ${firstName},</h3>
          <br/>
          Thank you for registration...
          ..
          ..
          ..
          ..

          <br/>
          Thank you,
          Airbnb Team
        
        `,
          () => {
            response.send(utils.createSuccessResult('registration finished'))
          }
        )
      }
    }
  )
})

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
  const statement = `select firstName, lastName, email, phoneNumber from user where id = ?`
  db.pool.query(statement, [request.userId], (error, users) => {
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
})

// protected API
router.delete('/close', (request, response) => {
  const query = `update user set isDeleted = 1 where id = ?`
  db.pool.execute(query, [request.userId], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

module.exports = router
