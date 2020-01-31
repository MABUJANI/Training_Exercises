function User(name){
  var displayName = function(greeting){
   console.log(greeting+' '+name);
  return "hi";
  }
return displayName;
}

var myFunc = User('Raj');
console.log(myFunc()); // undefined Raj
//myFunc('Hello '); //output: Hello Raj  