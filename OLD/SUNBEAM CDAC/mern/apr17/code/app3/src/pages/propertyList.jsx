import { useState } from 'react'
import Property from '../components/property'
import axios from 'axios'

function PropertyList() {
  const [properties, setProperties] = useState([])

  const loadProperties = async () => {
    const response = await axios.get('http://localhost:4000/property')
    const result = response.data
    // console.log(`result - `, result)
    if (result['status'] == 'success') {
      // update the state
      setProperties(result['data'])
    } else {
      alert(result['error'])
    }
  }

  return (
    <div>
      <h3>Property List</h3>
      <button onClick={loadProperties} className='btn btn-success'>
        Load Properties
      </button>
      <table className='table table-striped'>
        <thead>
          <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Detail</th>
            <th>Rent</th>
            <th>Address</th>
            <th>Contact Number</th>
          </tr>
        </thead>
        <tbody>
          {properties.map((property) => {
            return (
              <Property
                id={property.id}
                title={property.title}
                details={property.details}
                rent={property.rent}
                address={property.address}
                contactNo={property.contactNo}
              />
            )
          })}
        </tbody>
      </table>
    </div>
  )
}

export default PropertyList
