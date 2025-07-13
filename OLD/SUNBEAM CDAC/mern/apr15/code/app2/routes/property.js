const express = require('express')

const router = express.Router()

router.get('/list/:category', (request, response) => {
  // console.log(`category = `, request.params)
  // const category = request.params.category
  const { category } = request.params

  console.log(`select * from property where category = '${category}'`)
  console.log(`property list for category A api`)
  response.send('property list for category A completed')
})

/*
router.get('/list-by-categoryA', (request, response) => {
  // select * from property where category = 'A';
  console.log(`property list for category A api`)
  response.send('property list for category A completed')
})

router.get('/list-by-categoryB', (request, response) => {
  // select * from property where category = 'B';
  console.log(`property list for category B api`)
  response.send('property list for category B completed')
})

router.get('/list-by-categoryC', (request, response) => {
  // select * from property where category = 'C';
  console.log(`property list for category C api`)
  response.send('property list for category C completed')
})
*/

module.exports = router
