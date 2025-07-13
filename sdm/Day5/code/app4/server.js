const express = require('express')
const cors = require('cors')

const app = express()
app.use(cors())

app.get('/', (request, response) => {
  response.send('welcome to my new express application')
})

app.get('/users', (request, response) => {
  response.send([
    { id: 1, name: 'user 1', address: 'pune' },
    { id: 3, name: 'user 2', address: 'satara' },
    { id: 2, name: 'user 3', address: 'mumbai' },
  ])
})

app.get('/products', (request, response) => {
  response.send([
    { id: 1, title: 'product1', price: 100 },
    { id: 2, title: 'product2', price: 200 },
    { id: 3, title: 'product3', price: 300 },
  ])
})

app.listen(4000, '0.0.0.0', () => {
  console.log(`server is started on port 4000`)
})
