function Products({ products }) {
  return (
    <div>
      <h3 className='page-header'>List of Products</h3>

      <table className='table table-striped'>
        <thead>
          <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Description</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {products.map((product) => {
            return (
              <tr>
                <td>{product['id']}</td>
                <td>{product['title']}</td>
                <td>{product['description']}</td>
                <td>{product['price']}</td>
              </tr>
            )
          })}
        </tbody>
      </table>
    </div>
  )
}

export default Products
