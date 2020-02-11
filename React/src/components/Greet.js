import React from 'react';

function Greet({name,name1,children}){

    // console.log(props);
   // console.log(props.name);

return (
    <div>
     <h1>Hello {name}, Welcome to {name1} </h1>
     {children}
     </div>
);
}
export default Greet;