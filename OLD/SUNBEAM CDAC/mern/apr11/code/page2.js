// empty function declaration
function myFunction1() {}

// behind the scene, the function would get translated to the following vesion
// const myFunction1 = function () {}

// function call
// myFunction1()

// non-empty function
// parameter less function declaration
function myFunction2() {
  console.log(`inside myFunction2`)
}

// function call
// myFunction2()

// parameterized function
function myFunction3(p1, p2) {
  console.log('inside myFunction3')
  console.log(`p1 = ${p1}, type = ${typeof p1}`)
  console.log(`p2 = ${p2}, type = ${typeof p2}`)
}

// function call
// myFunction3(10, 20)

// it is alright to call the function with less number of parameters
// myFunction3('test')

// it is alright to call the function with more number of parameters
// myFunction3(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

// anonymous function: function without any name
// here myFunction4 is not function name
// rather it is a variable of type function
const myFunction4 = function () {
  console.log(`inside myFunction4`)
}

// getting the function information
// console.log(`myFunction4 = ${myFunction4}, type = ${typeof myFunction4}`)

// function call
// myFunction4()

// arrow function
const myFunction5 = () => {
  console.log(`inside myFunction5`)
}

// myFunction5()

// function accepting another function as a parameter
// callback function
// - in this case, since the function myFunction4 is getting executed
//   by myFunction6, it is called as callback function
// high order function
// - function which accepts at least one function parameter
const myFunction6 = (func) => {
  console.log(`func = ${func}, type = ${typeof func}`)

  // this will call the function which it refers to
  func()
}

// passing myFunction4 as parameter to myFunction6
// myFunction6(myFunction4)
