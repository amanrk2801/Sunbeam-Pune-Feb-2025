function Mobile({ info }) {
  const { model, company, config, price } = info
  // const { cpu, ram } = config

  return (
    <div>
      <h3>Mobile Component</h3>
      <div>Model: {model}</div>
      <div>Company: {company}</div>
      <div>Price: {price}</div>
      {/* 
      - conditional rendering 
      - if config object is valid (non-null or non-undefined) then only render the CPU and RAM
      */}

      {/* 
      {config && (
        <div>
          <div>CPU: {config.cpu}</div>
          <div>RAM: {config.ram}</div>
        </div>
      )}

      {!config && <div>config object is missing</div>} 
      */}

      <div>CPU: {config ? config.cpu : '-'}</div>
      <div>RAM: {config ? config.ram : '-'}</div>
    </div>
  )
}

export default Mobile
