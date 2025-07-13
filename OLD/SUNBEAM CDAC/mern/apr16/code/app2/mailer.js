const nodemailer = require('nodemailer')

async function sendEmail(to, subject, body, callback) {
  // create transport
  const transport = nodemailer.createTransport({
    service: 'gmail',
    auth: {
      user: 'pythoncpp@gmail.com',
      pass: 'srjgfuuoskuphgpy',
    },
  })

  // send email
  const result = await transport.sendMail({
    from: 'pythoncpp@gmail.com',
    to,
    subject,
    html: body,
  })

  console.log(`result: `, result)

  // call the callback function
  callback()
}

module.exports = {
  sendEmail,
}
