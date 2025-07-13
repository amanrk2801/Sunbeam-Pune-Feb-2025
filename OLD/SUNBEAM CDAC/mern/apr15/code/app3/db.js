const mysql = require('mysql2')

function openConnection() {
  // create connection
  const connection = mysql.createConnection({
    host: 'localhost',
    port: 3306,
    user: 'root',
    password: 'root',
    database: 'airbnb_db',
  })

  // open the connection
  connection.connect()

  // return the connection
  return connection
}

// export the function
module.exports = {
  openConnection,
}
