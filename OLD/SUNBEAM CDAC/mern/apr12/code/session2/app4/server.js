const express = require('express')
const mysql = require('mysql2')

const app = express()

function openDBConnection() {
  // create the connection
  const connection = mysql.createConnection({
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: 'root',
    database: 'dac_db',
  })

  // open the connection
  connection.connect()

  return connection
}

app.get('/', (request, response) => {
  response.send('welcome to my server')
})

app.get('/user', (request, response) => {
  const connection = openDBConnection()
  const statement = `select id, firstName, lastName, password, address from user;`
  connection.query(statement, (error, users) => {
    if (error) {
      console.log(error)
    }

    // close the connection
    connection.end()

    // send the list of users to the client
    response.send(users)
  })
})

app.get('/category', (request, response) => {
  const connection = openDBConnection()
  const statement = `select id, title, details from category;`
  connection.query(statement, (error, categories) => {
    if (error) {
      console.log(error)
    }

    // close the connection
    connection.end()

    // send the list of categories to the client
    response.send(categories)
  })
})

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
