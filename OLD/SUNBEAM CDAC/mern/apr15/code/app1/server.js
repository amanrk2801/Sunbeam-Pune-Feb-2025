const express = require('express')

const app = express()

// add the routes
const userRouter = require('./routes/user')
const propertyRouter = require('./routes/property')

app.use(userRouter)
app.use(propertyRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
