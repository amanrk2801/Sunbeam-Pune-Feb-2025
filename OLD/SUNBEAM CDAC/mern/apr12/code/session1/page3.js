// load the os system module
const os = require('node:os')

// console.log(os)

console.log(`hostname = ${os.hostname()}`)
console.log(`home directory = ${os.homedir()}`)
console.log(`cpu architecture = ${os.arch()}`)
console.log(`free memory = ${os.freemem() / (1024 * 1024)}MB`)

const cpus = os.cpus()
console.log(`no of cpus = ${cpus.length}`)

const models = cpus.map((cpu) => {
  return { model: cpu['model'], speed: cpu['speed'] }
})
console.log(models)
