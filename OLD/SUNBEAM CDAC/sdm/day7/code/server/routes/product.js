const express = require('express')
const router = express.Router()
const db = require('../db')
const utils = require('../utils')

router.get('/', (request, response) => {
  const statement = `SELECT id, title, description, price FROM product;`
  db.pool.query(statement, (error, products) => {
    response.send(utils.createResult(error, products))
  })
})

module.exports = router
