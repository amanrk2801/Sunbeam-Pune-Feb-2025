const express = require('express')

const router = express.Router()

router.post('/register', (request, response) => {
  console.log('user registration api')
  response.send('user registration completed')
})

router.post('/login', (request, response) => {
  console.log('user login api')
  response.send('user login completed')
})

module.exports = router
