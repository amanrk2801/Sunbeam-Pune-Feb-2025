const express = require('express')

// get the express router
// Router returns an object which helps express application
// to call required routes
// routing table
// http method      path        callback function
// POST         /user/register  (request, response) => {}
// POST         /user/login     (request, response) => {}

const router = express.Router()

router.post('/user/register', (request, response) => {
  console.log('user registration API')
  response.send('user registration completed')
})

router.post('/user/login', (request, response) => {
  console.log('user login API')
  response.send('user login completed')
})

// export the router
module.exports = router
