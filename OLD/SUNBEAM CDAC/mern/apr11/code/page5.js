function function1() {
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  const evenNumbers = []
  for (const number of numbers) {
    if (number % 2 == 0) {
      evenNumbers.push(number)
    }
  }

  console.log(numbers)
  console.log(evenNumbers)
}

// function1()

function function2() {
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
  const evenNumbers = numbers.filter((number) => {
    return number % 2 == 0
  })

  console.log(numbers)
  console.log(evenNumbers)
}

// function2()

function function3() {
  const marks = [16, 2, 3, 8, 14, 20, 15]

  // collect the marks of failed students
  // passing score = 12
  const failedStudents = marks.filter((mark) => {
    return mark < 12
  })

  console.log(marks)
  console.log(failedStudents)
}

// function3()

function function4() {
  const cars = [
    { model: 'triber', company: 'renault', price: 10 },
    { model: 'nano', company: 'tata', price: 2.5 },
    { model: 'XUV700', company: 'mahindra', price: 20 },
    { model: 'seltos', company: 'kia', price: 17 },
    { model: 'X5', company: 'BMW', price: 45 },
  ]

  // get all affordable (price <= 20) cars
  const affordableCars = cars.filter((car) => {
    return car['price'] <= 20
  })
  console.log(affordableCars)
}

// function4()

function function5() {
  const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  // get cube of odd numbers
  //   const oddNumbers = numbers.filter((number) => {
  //     return number % 2 != 0
  //   })

  //   const cubes = oddNumbers.map((number) => {
  //     return number ** 3
  //   })

  const cubes = numbers
    .filter((number) => {
      return number % 2 != 0
    })
    .map((number) => {
      return number ** 3
    })

  console.log(cubes)
}

function5()
