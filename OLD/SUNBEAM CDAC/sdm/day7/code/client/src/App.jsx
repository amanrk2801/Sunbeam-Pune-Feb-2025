import { useEffect, useState } from 'react'
import { getProducts } from './services/product'
import Products from './components/products'

function App() {
  const [products, setProducts] = useState([])

  const loadProducts = async () => {
    const response = await getProducts()
    if (response['status'] === 'success') {
      setProducts(response['data'])
    } else {
      alert('error loading products')
    }
  }

  useEffect(() => {
    loadProducts()
  }, [])

  return (
    <div className='container'>
      <Products products={products} />
    </div>
  )
}

export default App
