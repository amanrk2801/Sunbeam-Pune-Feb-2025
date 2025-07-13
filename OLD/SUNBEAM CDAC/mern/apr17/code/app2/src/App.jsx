import './App.css'
import Person from './components/person'
import Car from './components/car'
import Mobile from './components/mobile'
import CarList from './components/carList'

function App() {
  const person1 = {
    name: 'person1',
    address: 'pune',
    age: 30,
    phone: '+9123423234',
  }

  const person2 = {
    name: 'person2',
    address: 'Mumbai',
    age: 40,
    phone: '+91434345',
  }

  const car1 = {
    model: 'triber',
    company: 'renault',
    price: '10L',
  }

  const mobile = {
    model: 'iPhone',
    company: 'apple',
    price: 200000,
    config: {
      cpu: 'Apple A14',
      ram: '6GB',
    },
  }

  const cars = [
    { model: 'triber', company: 'renault', price: '10L' },
    { model: 'nano', company: 'tata', price: '2.5L' },
    { model: 'XUV700', company: 'Mahindra', price: '20L' },
    { model: 'Meridian', company: 'Jeep', price: '45L' },
  ]

  const car2 = {
    carModel: 'nano',
    carCompany: 'tata',
    carPrice: '2.5L',
  }

  const mobile2 = {
    model: 'Galaxy S23',
    company: 'samsung',
    price: 180000,
  }

  return (
    <div className='container'>
      <h1>App Component</h1>

      {/* name is attribute with person's name */}
      <Person
        name={person1.name}
        address={person1.address}
        age={person1.age}
        phone={person1.phone}
      />
      <hr />
      <Person
        name={person2.name}
        address={person2.address}
        age={person2.age}
        phone={person2.phone}
      />
      <hr />

      <Car model={car1.model} company={car1.company} price={car1.price} />
      <hr />

      <Mobile info={mobile} />
      <hr />

      <Mobile info={mobile2} />
      <hr />

      <CarList cars={cars} />
      <hr />

      <Car
        model={car2.carModel}
        company={car2.carCompany}
        price={car2.carPrice}
      />

      {/* <div>Name: {person1.name}</div>
      <div>Address: {person1.address}</div>
      <div>Age: {person1.age}</div>
      <div>Phone Number: {person1.phone}</div>

      <hr />

      <div>Name: {person2.name}</div>
      <div>Address: {person2.address}</div>
      <div>Age: {person2.age}</div>
      <div>Phone Number: {person2.phone}</div> */}
    </div>
  )
}

export default App
