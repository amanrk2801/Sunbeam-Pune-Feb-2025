function createSuccessResult(data) {
  return { status: 'success', data }
}

function createErrorResult(error) {
  return { status: 'error', error }
}

function createResult(error, data) {
  if (error) {
    return createErrorResult(error)
  } else {
    return createSuccessResult(data)
  }
}

module.exports = {
  createErrorResult,
  createSuccessResult,
  createResult,
}
