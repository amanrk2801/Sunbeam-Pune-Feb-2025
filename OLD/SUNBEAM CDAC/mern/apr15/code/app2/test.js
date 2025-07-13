// const num = 100
// console.log(`num = ${num}, type = ${typeof num}`)

// function myFunction() {
//   console.log(`inside myFunction`)
// }

// console.log(`myFunction = `, myFunction)
// console.log(`type of myFunction = `, typeof myFunction)

const person = {
  firstName: 'steve',
  lastName: 'jobs',
  address: 'usa',
}

// console.log(`last name = ${person.lastName}`)
// console.log(`first name = ${person.firstName}`)
// console.log(`address = ${person.address}`)

// object destructuring
// - converting the attributes of an object to variables
const { firstName, lastName, address } = person

// const firstName = person['firstName']
// const lastName = person['lastName']
// const address = person['address']

console.log(`first name = ${firstName}`)
console.log(`last name = ${lastName}`)
console.log(`address = ${address}`)

// array destructuring
const numbers = [10, 20]
const [var1, var2] = numbers

console.log(`var1 = ${var1}`)
console.log(`var2 = ${var2}`)

// const var1 = numbers[0]
// const var2 = numbers[1]
