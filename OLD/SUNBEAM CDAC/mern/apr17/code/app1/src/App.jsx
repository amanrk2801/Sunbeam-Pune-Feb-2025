import './App.css'

function App() {
  // variables
  const personName = 'elon musk'
  const address = 'USA'

  // Object
  const person = {
    name: 'Bill Gates',
    'home-address': 'USA',
    'company-address': 'USA',
    company: 'Microsoft',
    wealth: '$100b',
  }

  // array
  const cars = [
    { model: 'triber', company: 'renualt', price: '10L' },
    { model: 'nano', company: 'tata', price: '2.5L' },
    { model: 'X5', company: 'BMW', price: '45L' },
    { model: 'XUV700', company: 'Mahindra', price: '20L' },
    { model: 'Carens', company: 'Kia', price: '21L' },
    { model: 'Thar', company: 'Mahindra', price: '15L' },
  ]

  return (
    <div className='container'>
      <h1 style={{ color: 'red', textAlign: 'center', margin: 20 }}>
        App Component
      </h1>

      <h3>Render Variables</h3>
      <p>Person Name: {personName}</p>
      <p>Person Address: {address}</p>
      <hr />

      <h3>Render Object</h3>
      <p>name : {person.name}</p>
      <p>home address : {person['home-address']}</p>
      <p>company address : {person['company-address']}</p>
      <p>company founded : {person.company}</p>
      <p>worth : {person.wealth}</p>
      <hr />

      <h3>Render Array</h3>

      <h4>Using List</h4>
      <ul className='list-group'>
        {cars.map((car) => {
          return <li className='list-group-item'>{car.model}</li>
        })}
      </ul>
      <br />

      <h4>Using Table</h4>
      <table className='table table-bordered table-striped'>
        <thead>
          <tr>
            <th>Model</th>
            <th>Company</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {cars.map((car) => {
            return (
              <tr>
                <td>{car.model}</td>
                <td>{car.company}</td>
                <td>{car.price}</td>
              </tr>
            )
          })}
        </tbody>
      </table>

      <br />
      <h4>Using Divs</h4>
      {cars.map((car) => {
        return (
          <div className='car'>
            <div>Model: {car.model}</div>
            <div>Company: {car.company}</div>
            <div>Price: {car.price}</div>
            <div>-</div>
          </div>
        )
      })}
    </div>
  )
}

export default App
