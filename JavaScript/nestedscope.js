outest = "Im the most outside"

function outerFunc() 
{
  // the outer scope
  let outerVar = 'I am outside!';

  function innerFunc() 
  {
    // the inner scope
    console.log(outerVar); 
    function inInnerFunc(){
      console.log(outest);
    }
    
    inInnerFunc();
  }

  innerFunc();
}

outerFunc();


//output : "I am outside!"
//"Im the most outside"
