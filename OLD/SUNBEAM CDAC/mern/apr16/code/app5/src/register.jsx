function Register() {
  return (
    <div className='container'>
      <div className='mb-3'>
        <label htmlFor=''>First Name</label>
        <input type='text' className='form-control' />
      </div>
      <div className='mb-3'>
        <label htmlFor=''>Last Name</label>
        <input type='text' className='form-control' />
      </div>
      <div className='mb-3'>
        <label htmlFor=''>Email</label>
        <input type='text' className='form-control' />
      </div>
      <div className='mb-3'>
        <label htmlFor=''>Phone Number</label>
        <input type='text' className='form-control' />
      </div>
      <div className='mb-3'>
        <button className='btn btn-success'>Register</button>
        <button className='btn btn-danger'>Cancel</button>
      </div>
    </div>
  )
}

export default Register
