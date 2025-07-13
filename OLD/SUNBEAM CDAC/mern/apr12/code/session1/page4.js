// load fs module
const fs = require('node:fs')

// create a file and write into it
function writeMyFileSync() {
  fs.writeFileSync(
    './myFile.txt',
    'India is my country. I love India. All indians are my brothers and sisters.'
  )

  console.log(`data written to the file`)
}

// writeMyFileSync()

// read the file synchronously
function readDataSynchronously() {
  console.log(`reading file started`)

  // read the contents of myfile.txt
  // blocking API
  // - this function will block calling next statement(s) till it finishes its execution
  // - all the code statements will get executed sequentially
  const data = fs.readFileSync('./myFile.txt')
  console.log(`reading file finished`)

  // convert buffer into string
  const strData = String(data)
  console.log(strData)

  // perform mathematical operation
  console.log(`performing mathematical operation`)
  const result = 2342422443435345 * 23424244324234 * 2324234242
  console.log(`result = ${result}`)
  console.log(`performed mathematical operation`)
}

// readDataSynchronously()

function readDataAsynchronously() {
  console.log(`reading file started`)
  // asynchronous or non-blocking API
  // - does not block the next statement(s)
  // - non-sequentially code statements get executed
  fs.readFile('./myFile2.txt', (error, data) => {
    if (error) {
      console.log(`error: `, error)
    }
    console.log(`reading file (myFile2.txt) finished`)
  })

  fs.readFile('./myFile.txt', (error, data) => {
    if (error) {
      console.log(`error: `, error)
    }
    console.log(`reading file (myFile.txt) finished`)

    const strData = String(data)
    console.log(`data: `, strData)
  })

  // perform mathematical operation
  console.log(`performing mathematical operation`)
  const result = 2342422443435345 * 23424244324234 * 2324234242
  console.log(`result = ${result}`)
  console.log(`performed mathematical operation`)
}

readDataAsynchronously()
