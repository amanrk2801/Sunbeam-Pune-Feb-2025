const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.get('/', (request, response) => {
  const statement = `select id, title, details from category;`
  db.pool.query(statement, (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

router.post('/', (request, response) => {
  const { title, details } = request.body
  const statement = `insert into category (title, details) values (?, ?);`
  db.pool.execute(statement, [title, details], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

module.exports = router
