import React, { Component } from 'react';

// import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet';
import Welcome from './components/Welcome';
import Message from './components/Message';
import Counter from './components/Counter';

class Square extends Component{
  render(){

    return(
      <div className="App">
        {/* <Greet name="Jani" name1="Intralinks">
          <p>Working as Intern</p>
          <p>Upcoming Associate Software Engineer</p>
        </Greet>
        
        <Welcome name="Jani" name1="Intralinks">
        <p>Working as Intern</p>
          <p>Upcoming Associate Software Engineer</p>
        </Welcome> */}
        {/* <Message >
          <button >Subscribe</button>
        </Message> */}
        {/* <Counter /> */}
        <Welcome name="XYZ" name1="SS&C">
          <p>Below link will redirect you to Intralinks website</p>
          <a href="https://www.intralinks.com" target="blank">Intralinks</a>
        </Welcome>
      </div>



    );
  }
}
export default Square;