// array
// - collection of similar or dissimilar values
// - duplicate values are allowed

function function1() {
  // array of numbers
  const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

  // iterate over the array using for..of loop
  // for..of gives a value at every iteration
  for (const number of numbers) {
    console.log(`number = ${number}`)
  }
}

// function1()

function function2() {
  // array of numbers
  const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

  // iterate over the array using for..in loop
  // - for..in gives a index position at every iteration
  // - for..in starts from 0th index and goes till last index position
  for (const index in numbers) {
    console.log(`index = ${index}, number = ${numbers[index]}`)
  }
}

// function2()

function function3() {
  // array of numbers
  const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

  // iterate over the array using traditional for loop
  // used to control the start and stop index positions
  for (let index = 2; index < 6; index++) {
    console.log(`index = ${index}, number = ${numbers[index]}`)
  }
}

// function3()

function function4() {
  // array of numbers
  const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

  // iterate over the array using forEach loop
  // function forEach(func) {
  //   for (const number of numbers) {
  //     func(number)
  //   }
  // }
  numbers.forEach((number) => {
    console.log(`number = ${number}`)
  })
}

// function4()

function function5() {
  // array of numbers
  const array = [10, 20, 30, 40, 50]
  console.log(array)

  // append a value 60 at the end
  array.push(60)
  console.log(array)

  // remove the last value
  array.pop()
  console.log(array)
}

// function5()

function function6() {
  // array of numbers
  const array = [10, 20, 30, 40, 50]
  console.log(array)

  // remove the value 20
  // param1: index
  // param2: count of values to be deleted
  array.splice(1, 2)
  console.log(array)
}

// function6()

function function7() {
  // array of numbers
  const array = [10, 20, 30, 40, 50]
  console.log(array)

  // replace the value 20 with 25
  // param1: index
  // param2: count of values to be deleted
  // param3: value to be replaced
  array.splice(1, 1, 25)
  console.log(array)

  array.splice(3, 1, 65)
  console.log(array)
}

// function7()

function function8() {
  // array of numbers
  const array = [10, 20, 30, 40, 50]
  console.log(array)

  // add value 15 between 10 and 20
  // param1: index
  // param2: count of values to be deleted
  // param3: value to be replaced
  array.splice(1, 0, 15)
  console.log(array)

  // add value 25 between 20 and 30
  array.splice(3, 0, 25)
  console.log(array)
}

// function8()

function function9() {
  // create an empty array
  const array = new Array()

  array.push(10)
  array.push(20)
  array.push(30)
  array.push(40)
  array.push(50)

  console.log(array)
}

// function9()

function function10() {
  // array of strings
  const countries = ['india', 'usa', 'uk', 'japan']
  console.log(countries)

  // add a new value
  countries.push('bhutan')
  console.log(countries)

  // remove the last value
  countries.pop()
  console.log(countries)
}

function10()

function function11() {
  // array of dissimilar values
  const mixedValuesArray = [true, 10, 'test', 15.5, 29, 'test2']
  console.log(mixedValuesArray)

  // append a value false
  mixedValuesArray.push(false)
  console.log(mixedValuesArray)
}

// function11()
