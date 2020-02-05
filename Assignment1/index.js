var getUrl = 'https://dummy.restapiexample.com/api/v1/employees';
var deleteurl = 'http://dummy.restapiexample.com/api/v1/delete/';
var createUrl = 'http://dummy.restapiexample.com/api/v1/create';
var result1; 



fetch(getUrl).then((res) => res.json())
.then(function(result)
{
    console.log(result.data);
    result1 = result.data;
    for (var i = 0; i < result.data.length; i++) {
        row = datatable1.insertRow(-1);
        var cell = row.insertCell(-1);
        cell.innerHTML = result.data[i].id;
        var cell = row.insertCell(-1);
        cell.innerHTML = result.data[i].employee_name;
        var cell = row.insertCell(-1);
        cell.innerHTML = result.data[i].employee_salary;
        var cell = row.insertCell(-1);
        cell.innerHTML = result.data[i].employee_age;
        var cell = row.insertCell(-1);
        cell.innerHTML =`<button id =${result.data[i].id} class='btn btn-danger btn-sm' onclick='deleteRecord(${result.data[i].id})'>Delete</button>`
        
    }
})
// function createEmployee(){
//     console.log("clicked");

//     let name = document.getElementById('emp_name').value;
//     let salary = document.getElementById('emp_salary').value;
//     let age = document.getElementById('emp_age').value;
//     console.log(name)
//    // console.log(setTimeout(() => console.log("timeout")(), 50000));
//     console.log(salary)
// //  setTimeout(
// //      () =>{
// //    fetch(createUrl).then((res) => res.json()
// // .then(function(result)
// // {

// //     console.log("data",result);
// // }))
// // },2000)
//     // let response = fetch(createUrl, {
//     //     method: 'POST',
//     //     body:JSON.stringify({
            
//     //         name:name,
//     //         salary:salary,
//     //         age:age,

//     //     })

//     // })
//     // .then((response => response.json())
//     // .then((json) => {
//     //     console.log("create data", json.data);
//     //     row = datatable1.insertRow(-1);
//     //     var cell = row.insertCell(-1);
//     //     cell.innerHTML = json.data.id;
//     //     var cell = row.insertCell(-1);
//     //     cell.innerHTML = json.data.name;    
//     //     var cell = row.insertCell(-1);
//     //     cell.innerHTML = json.data.salary;
//     //     var cell = row.insertCell(-1);
//     //     cell.innerHTML = json.data.age;
//     //     var cell = row.insertCell(-1);
//     //     cell.innerHTML =`<button id =${json.data.id} class='btn btn-danger btn-sm' onclick='deleteRecord(${json.data.id})'>Delete</button>`
    
//     // }
    
    
//     // ));
//     return 1;
// }
function createEmployee(){

    let name = document.getElementById('emp_name').value;
    let salary = document.getElementById('emp_salary').value;
    let age = document.getElementById('emp_age').value;
    console.log(name)
    console.log(salary)
    let response = fetch(createUrl, {
        method: 'POST',
        body:JSON.stringify({
            
            name:name,
            salary:salary,
            age:age,

        })

    })
    .then((response => response.json()
    .then((json) => 
    {console.log(json.data);
     console.log(json);
        row = datatable1.insertRow(-1);
        var cell = row.insertCell(-1);
       cell.innerHTML = json.data.id;
       var cell = row.insertCell(-1);
        cell.innerHTML = json.data.name;
        var cell = row.insertCell(-1);
        cell.innerHTML = json.data.salary;
        var cell = row.insertCell(-1);
        cell.innerHTML = json.data.age;
        var cell = row.insertCell(-1);
        cell.innerHTML =`<button id =${json.data.id} class='btn btn-danger btn-sm' onclick='deleteRecord(${json.data.id})'>Delete</button>`
    
    }
    
    
    )));



   
}


function deleteRecord(a)
{
    console.log("clicked");
    console.log(a);
    
    
    document.getElementById(a).parentElement.parentElement.remove();

    // let response = fetch(deleteurl + a, {
    //     method: 'DELETE'
    // })
    // .then((response => response.json()
    // .then((json) => console.log(json))));

}






//     var col = [];
//         for (var i = 0; i < result1.length; i++) {
//             for (var key in result1[i]) {
//                 if (col.indexOf(key) === -1) {
//                     col.push(key);
//                 }
//             }
//         }

//         // CREATE DYNAMIC TABLE.
//         var table = document.createElement("table");

//         // CREATE HTML TABLE HEADER ROW USING THE EXTRACTED HEADERS ABOVE.

//         var tr = table.insertRow(-1);                   // TABLE ROW.

//         for (var i = 0; i < col.length-1; i++) {
//             var th = document.createElement("th");      // TABLE HEADER.
//             th.innerHTML = col[i];
//             tr.appendChild(th);
//         }

//         // ADD JSON DATA TO THE TABLE AS ROWS.
//         for (var i = 0; i < result1.length; i++) {

//             tr = table.insertRow(-1);

//             for (var j = 0; j < col.length-1; j++) {
//                 var tabCell = tr.insertCell(-1);
//                 tabCell.innerHTML = result1[i][col[j]];
//             }
//         }

//         // FINALLY ADD THE NEWLY CREATED TABLE WITH JSON DATA TO A CONTAINER.
//         var divContainer = document.getElementById("showData");
//         divContainer.innerHTML = "";
//         divContainer.appendChild(table);

// })





//     $(document).ready(function()
// {
//   $.getJSON(result.data,function(data){
//       var emp_data = '';
//       $.each(data,function(key,value){
//           emp_data += '<tr>';
//           emp_data += '<td>'+value.id+'<td>';
//             emp_data += '<td>'+value.employee_name+'<td>';
//                 emp_data += '<td>'+value.employee_salary+'<td>';
//                     emp_data += '<td>'+value.employee_age+'<td>';
//                         emp_data += '<tr>';
            
//       });
//       $('#datatable1').append(emp_data);
//   })

// });
// })
  
 