const express = require('express')

const app = express()
app.use(express.json())

// add the routers
const userRouter = require('./routes/user')
const categoryRouter = require('./routes/category')
const propertyRouter = require('./routes/property')

app.use('/user', userRouter)
app.use('/category', categoryRouter)
app.use('/property', propertyRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
