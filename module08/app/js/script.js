window.addEventListener('DOMContentLoaded', function () {
  main()
})

function main() {
  const root = document.getElementById('root')
  let appComponent = new App()
  appendComponent(root, appComponent)
}

function appendComponent(container, component) {
  let fRender = component.render()
  fRender(container)
}

class Component {
  props = {}
  state = {}

  constructor(props) {
    this.props = props
  }
}

class App extends Component {
  constructor(props) {
    super(props)
    this.state = {}

    this.handleChange = this.handleChange.bind(this)
  }

  handleChange(event) {
    console.log(this.state)
    this.state = {
      ...this.state,
      value: event.target.value
    }

    console.log(this.state)
  }

  render() {
    return (parent) => {
      let div = document.createElement('div')
      div.textContent = "Hello, I am App"

      let textField = new TextField({label: "Text Input 1", onChange: this.handleChange, className: "text-label"})
      appendComponent(div, textField)

      let textField2 = new TextField({label: "Text Input 2", onChange: this.handleChange, className: "text-label-red"})
      appendComponent(div, textField2)

      parent.append(div)
    }
  }
}



class TextField extends Component {

  constructor(props) {
    super(props)
    this.state = {}
  }

  render() {
    return (parent) => {
      let div = document.createElement('div')
      let label = document.createElement('label')
      label.className = this.props.className
      label.append(document.createTextNode(this.props.label))

      let input = document.createElement('input')
      input.onchange = this.props.onChange

      label.append(input)
      div.append(label)
      parent.append(div)
    }
  }
}

