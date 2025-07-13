const express = require('express')
const router = express.Router()
const crypto = require('crypto-js')
const utils = require('../utils')

// import database
const db = require('../db')

router.post('/register', (request, response) => {
  // object destructuring
  const { firstName, lastName, email, password, phone } = request.body

  // create query statement
  const query = `insert into user (firstName, lastName, email, password, phoneNumber) values (?, ?, ?, ?, ?);`

  // encrypt the password
  const encryptedPassword = String(crypto.SHA256(password))

  // get the opened connection
  const connection = db.openConnection()

  // execute query
  connection.execute(
    query,
    [firstName, lastName, email, encryptedPassword, phone],
    (error, result) => {
      // close the connection
      connection.end()
      response.send(utils.createResult(error, 'user registered successfully'))

      //   if (error) {
      //     response.send(utils.createErrorResult(error))
      //   } else {
      //     response.send(utils.createSuccessResult('user registered successfully'))
      //   }
    }
  )
})

router.post('/login', (request, response) => {
  const { email, password } = request.body

  // create the query
  const statement = `select id, firstName, lastName, phoneNumber from user where email = ? and password = ?`

  // encrypt the password
  const encryptedPassword = String(crypto.SHA256(password))

  const connection = db.openConnection()
  connection.query(statement, [email, encryptedPassword], (error, users) => {
    // close connection
    connection.end()

    // validate the result
    if (error) {
      response.send(utils.createErrorResult(error))
    } else {
      // check if user exists
      if (users.length == 0) {
        // no user exists with email and password
        response.send(utils.createErrorResult('user does not exist'))
      } else {
        // sending the first object from users array
        response.send(utils.createSuccessResult(users[0]))
      }
    }
  })
})

module.exports = router
