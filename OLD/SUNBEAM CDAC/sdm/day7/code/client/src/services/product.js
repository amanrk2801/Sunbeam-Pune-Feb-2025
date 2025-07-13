import axios from 'axios'
import { config } from './config'

export async function getProducts() {
  const url = `${config.serverUrl}/product`
  const response = await axios.get(url)
  return response.data
}
