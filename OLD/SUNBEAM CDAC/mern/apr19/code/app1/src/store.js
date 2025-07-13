import { configureStore } from '@reduxjs/toolkit'
import counterSlice from './features/counterSlice'

// create a global store for the application
export const store = configureStore({
  reducer: {
    counter: counterSlice,
  },
})
