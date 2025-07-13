function Person(props) {
  //   console.log(`props: `, props)

  return (
    <div>
      <h5>Person Component</h5>

      <div>Name: {props.name}</div>
      <div>Address: {props.address}</div>
      <div>Age: {props.age}</div>
      <div>Phone Number: {props.phone}</div>
    </div>
  )
}

export default Person
