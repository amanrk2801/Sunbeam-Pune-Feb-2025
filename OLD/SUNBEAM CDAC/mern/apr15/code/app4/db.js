const mysql = require('mysql2')

// Create the connection pool. The pool-specific settings are the defaults
const pool = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: 'root',
  port: 3306,
  database: 'airbnb_db',
  waitForConnections: true,
  connectionLimit: 10,
  maxIdle: 10,
  idleTimeout: 60000,
  queueLimit: 0,
  enableKeepAlive: true,
  keepAliveInitialDelay: 0,
})

// export the connection pool
module.exports = { pool }
