import { createSlice } from '@reduxjs/toolkit'

const counterSlice = createSlice({
  name: 'counter',
  initialState: {
    value: 10,
  },
  reducers: {
    incrementAction: (state) => {
      state.value += 1
    },
    decrementAction: (state) => {
      state.value -= 1
    },
  },
})

export const { incrementAction, decrementAction } = counterSlice.actions
export default counterSlice.reducer
