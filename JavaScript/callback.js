//CallBack: The callback function is a function passed into another function as an argument, 
//which is then invoked inside the outer function to complete some kind of routine or action.



function greeting(name) {
console.log('Hello ' + name);
}
function processUserInput(callback) {
    var name = prompt('Please enter your name.'); //Jani
    callback(name);
}
processUserInput(greeting); 
 //output: Hello Jani
