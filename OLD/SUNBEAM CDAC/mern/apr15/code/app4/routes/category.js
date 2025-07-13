const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.post('/', (request, response) => {
  const { title, details } = request.body
  const query = `insert into category (title, details) values (?, ?);`
  db.pool.execute(query, [title, details], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

router.get('/', (request, response) => {
  const { title, details } = request.body
  const query = `select id, title, details from category;`
  db.pool.query(query, [title, details], (error, categories) => {
    response.send(utils.createResult(error, categories))
  })
})

module.exports = router
