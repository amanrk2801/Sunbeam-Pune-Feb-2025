function Car({ model, company, price }) {
  // object destructuring
  // const { model, company, price } = props

  return (
    <div>
      <h3>Car Component</h3>
      <div>Model: {model}</div>
      <div>Company: {company}</div>
      <div>Price: {price}</div>
    </div>
  )
}

export default Car
