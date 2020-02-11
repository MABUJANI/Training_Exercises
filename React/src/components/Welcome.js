import React,{Component} from 'react';

class Welcome extends Component{
    
    render(){
        const {name,name1,children} = this.props;  // destructuring props
        console.log(this.props);
        return(
            <div>
        <h1>Hello World {name} {name1}</h1>
        {children}
        </div>
        );
    }
}

export default Welcome;