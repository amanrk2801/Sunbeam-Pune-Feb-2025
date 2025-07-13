# JS frameworks

- framework (collection of multiple modules, scripts, classes) which is used for website development
- e.g.
  - react
  - angular
  - vue.js

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
