const express = require('express')
const mysql = require('mysql2')

function openDBConnection() {
  // create a connection
  const connection = mysql.createConnection({
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: 'root',
    database: 'dac_db',
  })

  // open the connection
  connection.connect()

  // return connection
  return connection
}

const app = express()

app.get('/product', (request, response) => {
  // query to execute
  const statement = `select id, title, details, price from product;`

  // open connection with mysql database
  const connection = openDBConnection()

  connection.query(statement, (error, products) => {
    if (error) {
      console.log(`error: `, error)
    }

    // close the connection
    connection.end()

    // send the data to the client
    response.send(products)
  })
})

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})
