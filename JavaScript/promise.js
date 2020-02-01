//Promise: The Promise object represents the eventual completion (or failure) of an asynchronous operation, and its resulting value 

//A Promise is in one of these states:
//pending: initial state, neither fulfilled nor rejected.
//fulfilled: meaning that the operation completed successfully.
//rejected: meaning that the operation failed.

var promise1 = new Promise(function(resolve,reject){
    isDboperationSuccess = true;
    if(isDboperationSuccess){
      resolve('Completed');
    }
  else{
    reject('Not Completed');
  }
  
});

promise1.then(function(success){
  console.log(success);  // Completed
}).catch(function(error){
  console.log(error); // Not Completed
})
