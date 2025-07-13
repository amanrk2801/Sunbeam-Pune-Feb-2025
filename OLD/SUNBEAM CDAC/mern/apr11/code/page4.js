// functional programming

function function1() {
  const numbers = [1, 2, 3, 4, 5]
  const squares = []
  for (const number of numbers) {
    squares.push(number * number)
  }
  console.log(numbers)
  console.log(squares)
}

// function1()

function function2() {
  const numbers = [1, 2, 3, 4, 5]
  const squares = numbers.map((number) => {
    return number * number
  })
  console.log(numbers)
  console.log(squares)
}

// function2()

function function3() {
  const temperatures_c = [37, 38, 38.5, 39, 40]
  //   const temperatures_f = []
  //   for (const temperature of temperatures_c) {
  //     const temperature_f = 32 + temperature * (9 / 5)
  //     temperatures_f.push(temperature_f)
  //   }

  const temperatures_f = temperatures_c.map((temperature) => {
    return 32 + temperature * (9 / 5)
  })
  console.log(temperatures_c)
  console.log(temperatures_f)
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

  // get model of every car in models array
  // select model from cars;
  //   const models = []
  //   for (const car of cars) {
  //     models.push(car['model'])
  //   }
  const models = cars.map((car) => {
    return car['model']
  })

  console.log(models)

  // get model and price
  // select model, price from cars;
  const newCars = cars.map((car) => {
    return { model: car['model'], price: car['price'] }
  })
  console.log(newCars)
}

function4()
