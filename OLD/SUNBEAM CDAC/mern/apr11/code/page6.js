// object

function function1() {
  // JSON
  const person = {
    name: 'person1',
    age: 30,
    address: {
      city: 'pune',
      state: 'mh',
      country: 'india',
    },
    email: 'person1@test.com',
  }

  console.log(person)
}

// function1()

function function2() {
  // array of objects
  const persons = []

  persons.push({
    name: 'person1',
    address: 'pune',
  })

  persons.push({
    name: 'person2',
    address: 'mumbai',
  })

  persons.push({
    name: 'person2',
    address: 'nashik',
  })

  console.log(persons)
}

function2()
