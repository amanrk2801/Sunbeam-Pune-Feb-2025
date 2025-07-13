# JS frameworks

- framework (collection of multiple modules, scripts, classes) which is used for website development
- e.g.
  - react
  - angular
  - vue.js

## DOM

- stands for Document Object Model
- tree like structure made up of JS objects of html/css elements
- hierarchy of the web page

# react

- JS library used to develop website (client application)
- features
  - simple to develop the applications using react
  - used to develop both SPA and MPA (traditional approach)
  - react is faster
  - it has a good eco system
    - ReactJS: used for developing websites
    - React Native: used to developing native mobile application (iOS and Android)
    - NextJS: library added on top of react for SSR (server sided Rendering)
    - React Native for Desktop: used to develop applications for native OS (windows and macOS)
  - react supports hooks
  - by default supports react redux
  - react supports JSX = JS + html

## contents

- react basics
- JSX fundamentals
- react components
- props
- state
- react hooks
- axios for REST APIs
- react redux
- react router

## installation

```bash

# install create-react-app
> sudo npm install -g create-react-app

# or

# create react app
# > npx create-react-app <application name>
> npx create-react-app app4

# go to the application directory
> cd app4

# run the react application
> npm start
> yarn start

# test the application
> npm test
> yarn test

# build the application
> npm run build
> yarn build

```

## project hierarchy

- README.md: used to add documentation or readme information about project
- package.json
  - name: name of the project
  - version: version of project
  - private: is the project private or open source
  - dependencies
    - list of dependencies (dependent packages) which are required to `run` the application
    - these modules/libraries/packages will be bundled with the final application
    - e.g. react is dependency
  - devDependencies
    - list of dependencies (dependent packages) which are required to `develop` the application
    - these modules will NOT be bundled with the final application
    - e.g. typescript is a devDependency
  - scripts
    - the keys which are used to execute commands
    - e.g.
      - start: used to start the application
      - test: used to test the application
      - build: used to build the application to create js bundle
- package-lock.json
  - contains all the installed libraries/modules/packages
  - gets created when `npm install` or `yarn install` command is used
- .gitignore
  - list of files or directories which need not go to git repository
  - this is used by git to ignore the list of files or directories
- node_modules
  - directory which contains the node modules which are downloaded in the current project
  - the package.json contains the list of modules to be downloaded
  - gets created automatically when `npm install` or `yarn install` command is executed
  - note: never add this directory in git repository
- public: contains the public files
  - index.html
    - this is the ONLY html file in the react project
  - favicon.ico
    - icon which gets rendered on current tab (tab icon)
  - manifest.json
    - contains the project information
- src: source code of react application
  - index.js
    - contains the react entry point function (where the application starts)
  - App.js
    - default component (page) of react application
  - reportWebVital.js
    - contains the code to check the performance or vitality of the application
  - setupTests.js
    - contains the code to configure the app testing
    - used to unit test the react application

## package.json

- can be created using npm init command

## react application start or react booting

- `yarn start` starts a lite-server on port 3000
- loads the file public/index.html
- index.html contains a div with id as root
  - this div is the one where the whole react application gets loaded
- the index.html loads index.js
- get object of root div (div which has id as root)
- the root div object is passed to ReactDOM.createRoot()
  - the ReactDOM.createRoot() is used to define the root element to load the react application
- the react app root renders the react application from App.js component

## component

- basic reusable entity in react
- react website is made using components
- react page is having one or more components
- types
  - class component
    - created using class
    - deprecated because of performance reason
    - to take advantage of state
  - functional component
    - created using a function
    - function which returns html element
    - react supports hook, these components are preferred
- components are rendered as html elements
  - e.g. <App /> is a functional component
- it is mandatory to return one and only one html element from the component
- styling the component

  - adding element decorations
  - types

    - inline style

      - adding the style object in the element itself

      ```js
      <h1 style={{ color: 'red', textAlign: 'center' }}>App Component</h1>
      ```

    - external style

      - same as css external styles

      ```js
      import './App.css'
      ;<h1 className='header'>App Component</h1>
      ```

## props

- collection of properties which are shared by parent component with the child component
- in child component the props object is treated as readonly

```js

function Person(props) {
  return <div>
    Name: {props.name}
  </div>
}

// usage
<Person name="person1">

```

## state

- object maintained by a component
- component specific
- has read and write access (not readonly like props)
- if state is changes, the UI dependent on the states is reloaded

## conditional rendering

- rendering based on a condition
- if a condition is true then only render the UI

```js
{
  config && <div>config is available</div>
}

{
  !config && <div>config is NOT available</div>
}
```

## react hook

- is special function which starts with use keyword
- e.g.
  - useState()
    - hook which is used to maintain a state member in a component
    - returns an array of two members
      - 0th member: reference of the variable which stores the value
      - 1st member: reference of the function used to set the value
    - e.g.
      - const [counter, setCounter] = useState(0)
  - useEffect()
  - useNavigate()
- NOTES:
  - react hook can NOT be called outside the component (top level)
  - react hook must be called inside the component `directly`
    - can NOT be called inside any function in component

## bootstrap

- framework which consists of
  - css classes for decorating numerous elements like headers, tables, buttons etc.
  - js components
- css classes
  - container (div)
    - class used to put the contents (elements) in the center of the screen
  - container-fluid (div)
    - class used to use the full view port of the page

## VS Code plugins

- auto import
  - https://marketplace.visualstudio.com/items?itemName=steoates.autoimport
- auto close tag
  - https://marketplace.visualstudio.com/items?itemName=formulahendry.auto-close-tag
- auto rename tag
  - https://marketplace.visualstudio.com/items?itemName=formulahendry.auto-rename-tag
- spelling checker
  - https://marketplace.visualstudio.com/items?itemName=streetsidesoftware.code-spell-checker
- prettier
  - https://marketplace.visualstudio.com/items?itemName=esbenp.prettier-vscode
- code snippets
  - https://marketplace.visualstudio.com/items?itemName=burkeholland.simple-react-snippets

## react router

- used to add the routing capability in the react application
- this package will help application to navigate amongst the components
- the react-router-dom handles the navigation on client side
  - it does not send any request to server for navigation
- installation

  - yarn add react-router-dom

- steps

```js
// index.js

import { BrowserRouter } from 'react-router-dom'

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </React.StrictMode>
)
```

```js
// App.js

import { Route, Routes } from 'react-router-dom'

function App() {
  return (
    <div className='container'>
      <Routes>
        <Route path='/login' element={<LoginUser />} />
        <Route path='/register' element={<RegisterUser />} />
        <Route path='/home' element={<Home />} />
      </Routes>
    </div>
  )
}
```

- navigate from one to another component

  - static

    - navigating from one to another without using JS code (logic)
    - can be implemented using Link tag

    ```js
    //<Link to='route'>text</Link>
    <Link to='/login'>Login here</Link>
    ```

  - dynamic

    - navigating from one to another component using JS code
    - implementing logic for navigation

    ```js
    import { Link, useNavigate } from 'react-router-dom'

    function RegisterUser() {
      const navigate = useNavigate()

      const onCancel = () => {
        navigate('/login')
      }
    }
    ```

## read input from user

- to get input from user, use the change event object
- for every input a state member is required

```js

// create a state member
const [email, setEmail] = useState()

// get the input from user using onChange property of input
<input onChange={(e) => { setEmail(e.target.value) }} type="text" />

```

## add react toastify

- install the package
  - yarn add react-toastify

```js
// add the css and toast container in App.jsx
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'

// add the ToastContainer in the App component
function App() {
  return (
    <div>
      <ToastContainer />
    </div>
  )
}
```

## redux

- design pattern and library to manage the application global store (state)
- the global store is shared among all the components in the application
- parts
  - action
    - also known as an event
  - reducer
    - function which manages the global state
    - also known as event handler
    - to configure the reducer provide
      - action (event)
      - action handler (function)
  - store
    - global state
    - collection of key-value pairs (object)
- installation
  - yarn add react-redux @reduxjs/toolkit
- redux hooks
  - useSelector()
    - used to read the global state
  - useDispatch()
    - used to update the global state
- implementation

```js
// store.js

import { configureStore } from '@reduxjs/toolkit'
import counterSlice from './features/counterSlice'

// create a global store for the application
export const store = configureStore({
  reducer: {
    counter: counterSlice,
  },
})
```

```js
// index.js

import { store } from './store'

const root = ReactDOM.createRoot(document.getElementById('root'))
root.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
)
```

```js
// features/counterSlice.js

import { createSlice } from '@reduxjs/toolkit'

const counterSlice = createSlice({
  name: 'counter',
  initialState: {
    value: 0,
  },
  reducers: {
    incrementAction: (state) => {
      state.value += 1
    },
    decrementAction: (state) => {
      state.value -= 1
    },
  },
})

export const { incrementAction, decrementAction } = counterSlice.actions
export default counterSlice.reducer
```
