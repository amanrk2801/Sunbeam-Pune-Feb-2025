import { useState } from 'react'
import Category from '../components/category'
import axios from 'axios'

function CategoryList() {
  // empty data
  const [categories, setCategories] = useState([])

  // load categories from server
  const loadCategories = async () => {
    // send the request and get the response
    const response = await axios.get('http://localhost:4000/category/')

    // read the json data from response
    const result = response.data
    console.log(result)

    // update the state
    setCategories(result['data'])
  }

  const onButtonClick = () => {
    loadCategories()
  }

  return (
    <div>
      <h3>Categories</h3>

      <button onClick={onButtonClick} className='btn btn-success'>
        Load Categories
      </button>

      <table className='table table-striped'>
        <thead>
          <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Details</th>
          </tr>
        </thead>
        <tbody>
          {categories.map((category) => {
            return (
              <Category
                id={category.id}
                title={category.title}
                details={category.details}
              />
            )
          })}
        </tbody>
      </table>
    </div>
  )
}

export default CategoryList
