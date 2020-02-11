import React,{Component} from 'react';

class Message extends Component{

    constructor(){
        super();
        this.state ={
            message:"Welcome to Intralinks"
        }
    }
    changeMessage(){
        this.setState({
            message:"Thank you for subscrbing"
        })
    }
    render(){
        return(

            <div>
                <h1>{this.state.message}</h1>
                <button onClick={() => this.changeMessage()}>Subscribe</button>
                
            </div>
        );
    }
}
export default Message;