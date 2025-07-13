import { useState } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { incrementAction, decrementAction } from '../features/counterSlice'

function Counter1() {
  // call useSelector() to read the global state
  const counter = useSelector((state) => state.counter)

  // call useDispatch to get a dispatch object
  const dispatch = useDispatch()

  const increment = () => {
    // send an action to dispatch object
    // trigger the increment action
    dispatch(incrementAction())
  }

  const decrement = () => {
    dispatch(decrementAction())
  }

  return (
    <div>
      <h2>Counter 1</h2>
      <div>counter: {counter.value}</div>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
    </div>
  )
}

export default Counter1
