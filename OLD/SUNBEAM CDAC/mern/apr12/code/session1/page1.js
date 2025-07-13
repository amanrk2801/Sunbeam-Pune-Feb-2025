const pi = 3.14

// function declaration
function add(p1, p2) {
  console.log(`${p1} + ${p2} = ${p1 + p2}`)
}

function subtract(p1, p2) {
  console.log(`${p1} - ${p2} = ${p1 - p2}`)
}

// const add = function() {...}

// function call
// add(10, 20)

// export the function add
// module.exports = {
//   add: add,
// }

module.exports = {
  myAdd: add,
  subtract,
  pi,
}

// console.log(module)
