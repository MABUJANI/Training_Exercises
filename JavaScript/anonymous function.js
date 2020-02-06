const func = function(){
  console.log("Hello");
  return function (){};
}

console.log(func().name);
