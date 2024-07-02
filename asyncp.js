async function myfunc(params) {
    return "Hello world";        
}

function myfunc2(params) {
    return Promise.resolve("Hello world");
}

myfunc2().then(
    function(value) {console.log("success")},
    function(error) {console.log("error")},
);

myfunc().then(
    function(value) {console.log("success")},
    function(error) {console.log("error")},
);