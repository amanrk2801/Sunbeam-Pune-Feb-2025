import Car from './car'

function CarList({ cars }) {
  return (
    <div>
      <h1>Cars Information</h1>
      {cars.map((car) => {
        return <Car model={car.model} company={car.company} price={car.price} />
      })}
    </div>
  )
}

export default CarList
