import logo from './logo.svg'
import './App.css'

function App() {
  // variables
  const num = 200
  const firstName = 'steve'
  const canVote = true
  const address = `abcd,
  paqr, 
  pune 41`

  // object
  const car = {
    model: 'triber',
    company: 'renault',
    price: 10,
  }

  // array
  const mobiles = [
    { model: 'iPhone 15', company: 'apple', price: 200000 },
    { model: 'Galaxy S24', company: 'Samsung', price: 120000 },
    { model: 'One Plus 11', company: 'One Plus', price: 90000 },
  ]

  return (
    <div>
      <h1>App Component</h1>

      <h3>Variables</h3>
      <div>the value of num = {num}</div>
      <div>first name = {firstName}</div>
      <div>canVote = {canVote ? 'Yes' : 'No'}</div>
      <div>address = {address}</div>

      <hr />

      <h3>Car (object) Information</h3>
      <div>Model = {car.model}</div>
      <div>Company = {car.company}</div>
      <div>Price = {car.price}</div>

      <hr />

      <h3>Array Information</h3>
      <div>
        {mobiles.map((mobile) => {
          return (
            <div class='mobile'>
              <div>Model = {mobile.model}</div>
              <div>Company = {mobile.company}</div>
              <div>Price = {mobile.price}</div>
              <div>-</div>
            </div>
          )
        })}
      </div>
    </div>
  )
}

export default App
