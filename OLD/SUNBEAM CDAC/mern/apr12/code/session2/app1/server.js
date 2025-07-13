// required express module
const express = require('express')

// create an express application
const app = express()

// route
// - mapping of method and path
// - GET /
app.get('/', (request, response) => {
  response.send('response for GET /')
})

app.post('/', (request, response) => {
  response.send('response for POST /')
})

app.delete('/', (request, response) => {
  response.send('response for DELETE /')
})

app.put('/', (request, response) => {
  response.send('response for PUT /')
})

app.get('/user', (request, response) => {
  response.send('response for GET /user')
})

// start the application
app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
