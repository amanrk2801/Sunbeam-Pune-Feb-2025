const express = require('express')

const app = express()

// use the json parser to parse the request body object
app.use(express.json())

// add the routers
const userRouter = require('./routes/user')
app.use('/user', userRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
