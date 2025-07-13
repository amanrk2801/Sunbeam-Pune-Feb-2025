const express = require('express')

const router = express.Router()

router.get('/list', (request, response) => {
  console.log(`category list api `)
  response.send('category get completed')
})

module.exports = router
