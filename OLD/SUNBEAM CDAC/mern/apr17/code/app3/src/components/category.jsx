function Category({ id, title, details }) {
  return (
    <tr>
      <td>{id}</td>
      <td>{title}</td>
      <td>{details}</td>
    </tr>
  )
}

export default Category
