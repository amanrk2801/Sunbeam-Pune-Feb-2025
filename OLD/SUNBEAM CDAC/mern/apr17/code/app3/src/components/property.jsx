function Property({ id, title, details, rent, address, contactNo }) {
  return (
    <tr>
      <td>{id}</td>
      <td>{title}</td>
      <td>{details}</td>
      <td>{rent}</td>
      <td>{address}</td>
      <td>{contactNo}</td>
    </tr>
  )
}

export default Property
