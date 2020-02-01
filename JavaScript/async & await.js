
//async & await basically just syntactic sugar on top of Promises

//In fact, every async function we write will return a promise, and every single thing we await will ordinarily be a promise.

const greeter = new Promise((res,rej) => res("Welcome to Intralinks"))
async function f1(){
  const greeting = await greeter;
  console.log(greeting);
}f1();
