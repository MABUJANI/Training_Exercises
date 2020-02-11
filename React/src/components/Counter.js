import React, { Component } from 'react'

export class Counter extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             count:0
        }
    }
    
    incrementValue()
    {
        // this.setState({
        //     count:this.state.count+1
        // },
        // () =>{
        //     console.log("Call back",this.state.count);
        // }
        // )

        this.setState((prevState) => ({
            count:prevState.count + 1,
        })

        )


       // console.log(this.state.count);  
     


}

    incrementFive()
    {
        this.incrementValue();
        this.incrementValue();
        this.incrementValue();
        this.incrementValue();
    }

    decrementValue(countDec){
        this.setState({
            count:countDec - 1,
        })
    }
    render() {
        return (
            <div>
                <h1>Count Value - {this.state.count}</h1>
                <button onClick={() =>this.incrementFive()}>Increment</button>
                <button onClick={() => this.decrementValue(this.state.count)}>Decrement</button>
            </div>
        )
    }
}

export default Counter;
