import { useState } from 'react'

function Counter() {
  // the default of counter is set to 0
  const [counter, setCounter] = useState(0)

  const incrementCounter = () => {
    // update the counter with new value
    setCounter(counter + 1)
    console.log(`current counter value = ${counter}`)
  }

  const decrementCounter = () => {
    // update the counter with new value
    setCounter(counter - 1)
    console.log(`current counter value = ${counter}`)
  }

  return (
    <div>
      <h3>Counter</h3>

      <div>Counter = {counter}</div>
      <div>Counter = {counter}</div>
      <div>Counter = {counter}</div>
      <div>Counter = {counter}</div>
      <div>Counter = {counter}</div>
      <div>Counter = {counter}</div>
      <div>Counter = {counter}</div>
      <button onClick={incrementCounter} className='btn btn-success'>
        Increase by 1
      </button>
      <button onClick={decrementCounter} className='btn btn-warning ms-2'>
        Reduce by 1
      </button>
    </div>
  )
}

export default Counter
