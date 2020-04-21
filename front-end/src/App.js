import React from 'react';
import './App.css';
import Main from './components/Main/'
import Menu from './components/Menu/'

class App extends React.Component {

  constructor(props) {

    super(props)

    this.state = {

      source: ''

    }

  }

  setSource = (source) => {

    this.setState({ source })

  }



//https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d470400.4150229554!2d-43.72687010222971!3d-22.913251252234634!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9bde559108a05b%3A0x50dc426c672fd24e!2sRio%20de%20Janeiro%2C%20RJ!5e0!3m2!1spt-BR!2sbr!4v1587312247161!5m2!1spt-BR!2sbr
  
  render () {
    
    return (

      <div className="App">

        <Menu handleSubmit={this.setSource}></Menu>
        <Main source={this.state.source}></Main>

      </div>

    )



  }

}

export default App;
