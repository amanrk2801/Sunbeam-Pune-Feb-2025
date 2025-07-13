const express = require('express')

const app = express()

// json body
app.use(express.json())

// www form url encoded
app.use(express.urlencoded({ extended: true }))

// add the routes
const userRouter = require('./routes/user')
app.use('/user', userRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
