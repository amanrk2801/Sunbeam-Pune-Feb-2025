// web service or web APIs
// - service without UI
// - mainly used for communicating with database

// load the http module
const http = require('node:http')

// step1: create a server object
const server = http.createServer((request, response) => {
  console.log(`a client has connected...`)
  console.log(`method = ${request.method}`)
  console.log(`url = ${request.url}`)

  // process request

  // I am finished with response creation
  // send this response object to the client
  response.statusCode = 400
  response.end('this is a message from server')
})

// step2: start the server on a required port
server.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
