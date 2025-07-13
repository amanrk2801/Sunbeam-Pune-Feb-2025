const express = require('express')
const mysql = require('mysql2')

function openDBConnection() {
  const connection = mysql.createConnection({
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: 'root',
    database: 'dac_db',
  })
  connection.connect()
  return connection
}

const app = express()

// middleware used to parse the body received from request
app.use(express.json())

/*
// add a middleware for handing the common logic
app.use((request, response, next) => {
  console.log(`inside a middleware 1`)
  console.log(`method: ${request.method}`)
  console.log(`url: ${request.url}`)
  console.log('------')

  // I am done with common logic
  // now call the real route
  next()
})

app.use((request, response, next) => {
  console.log(`inside a middleware 2`)
  next()
})

app.use((request, response, next) => {
  console.log(`inside a middleware 3`)
  next()
})
*/

app.get('/', (request, response) => {
  console.log(`route for GET /`)
  response.send('response for GET /')
})

app.post('/', (request, response) => {
  console.log(`route for POST /`)
  response.send('response for POST /')
})

app.put('/', (request, response) => {
  console.log(`route for PUT /`)
  response.send('response for PUT /')
})

app.post('/user', (request, response) => {
  const statement = `insert into user (firstName, lastName, address, password) values (?, ?, ?, ?);`
  const connection = openDBConnection()
  connection.execute(
    statement,
    [
      request.body.firstName,
      request.body.lastName,
      request.body.address,
      request.body.password,
    ],
    (error, result) => {
      if (error) {
        console.log(`error: `, error)
      }
      response.send('inserted a user record')
    }
  )
})

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
