const express = require('express')

const app = express()

app.get('/', (request, response) => {
  console.log('request received for GET /')
  response.send('response for GET /')
})

// host address
// - localhost
// - 127.0.0.1: loopback address
// - 0.0.0.0

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})
