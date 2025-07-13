import { useState } from 'react'
import { useSelector } from 'react-redux'

function Counter2() {
  const counter = useSelector((state) => state.counter)

  return (
    <div>
      <h2>Counter 2</h2>
      <div>counter = {counter.value}</div>
    </div>
  )
}

export default Counter2
