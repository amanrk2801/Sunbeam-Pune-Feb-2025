const express = require('express')
const cors = require('cors')

const app = express()
app.use(cors())

const productRouter = require('./routes/product')
app.use('/product', productRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})
