const express = require('express')
const crypto = require('crypto-js')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.post('/register', (request, response) => {
  const { firstName, lastName, email, password, phone } = request.body

  const query = `insert into  user (firstName, lastName, email, password, phoneNumber) values (?, ?, ?, ?, ?);`
  const encryptedPassword = String(crypto.SHA256(password))

  db.pool.execute(
    query,
    [firstName, lastName, email, encryptedPassword, phone],
    (error, result) => {
      response.send(utils.createResult(error, result))
    }
  )
})

router.post('/login', (request, response) => {
  const { email, password } = request.body
  const query = `select id, firstName, lastName, phoneNumber, isDeleted from user where email = ? and password = ?`
  const encryptedPassword = String(crypto.SHA256(password))

  db.pool.execute(query, [email, encryptedPassword], (error, users) => {
    if (error) {
      response.send(utils.createErrorResult(error))
    } else {
      if (users.length == 0) {
        response.send(utils.createErrorResult('user does not exist'))
      } else {
        const user = users[0]

        // check if user is deleted
        if (user['isDeleted'] == 1) {
          response.send(
            utils.createErrorResult('you have closed your account.')
          )
        } else {
          response.send(utils.createSuccessResult(user))
        }
      }
    }
  })
})

router.delete('/:id', (request, response) => {
  const { id } = request.params
  const query = `update user set isDeleted = 1 where id = ?`
  db.pool.execute(query, [id], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

module.exports = router
