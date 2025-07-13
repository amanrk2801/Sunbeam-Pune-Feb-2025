const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.get('/', (request, response) => {
  const statement = `select id, title, details from category;`
  db.pool.query(statement, (error, categories) => {
    response.send(utils.createResult(error, categories))
  })
})

router.post('/', (request, response) => {
  const { title, details } = request.body
  const statement = `insert into category (title, details) values (?, ?)`
  db.pool.execute(statement, [title, details], (error, categories) => {
    response.send(utils.createResult(error, categories))
  })
})

module.exports = router
