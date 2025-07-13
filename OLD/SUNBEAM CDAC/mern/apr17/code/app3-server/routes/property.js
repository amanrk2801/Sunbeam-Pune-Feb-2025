const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.get('/', (request, response) => {
  const statement = `select id, title, details, rent, address, contactNo from property;`
  db.pool.query(statement, (error, properties) => {
    response.send(utils.createResult(error, properties))
  })
})

module.exports = router
