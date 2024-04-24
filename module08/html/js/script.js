function myAlert() {
  var vInput = document.getElementById("text-123")

  alert(`Value is ${vInput.value}`)
}

function handleOnChange(input) {
  console.log(input)
  console.log(input.value)
}