const express = require('express')
const jwt = require('jsonwebtoken')
const config = require('./config')
const utils = require('./utils')

const app = express()

// json body
app.use(express.json())

// www form url encoded
app.use(express.urlencoded({ extended: true }))

// middleware to verify the token
app.use((request, response, next) => {
  // check if the url is of public API
  if (request.url == '/user/login' || request.url == '/user/register') {
    // token is not required
    // skip checking the token
    next()
  } else {
    // read the token
    const token = request.headers['token']
    if (!token || token.length == 0) {
      response.send(utils.createErrorResult('missing token'))
      return
    }

    try {
      // verify the token
      const payload = jwt.verify(token, config.secret)

      // add the user id in request
      request.userId = payload['id']

      // call the next function
      next()
    } catch (ex) {
      response.send(utils.createErrorResult('invalid token'))
    }
  }
})

// add the routes
const userRouter = require('./routes/user')
const categoryRouter = require('./routes/category')

app.use('/user', userRouter)
app.use('/category', categoryRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
