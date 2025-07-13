const express = require('express')
const router = express.Router()

router.post('/property/add', (request, response) => {
  console.log(`property add API`)
  response.send('property add completed')
})

router.get('/property/list', (request, response) => {
  console.log(`property list API`)
  response.send('property list completed')
})

module.exports = router
