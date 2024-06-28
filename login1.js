function login() {
    let a = document.getElementById("a").value;
    let b = document.getElementById("b").value;

    if(a == "RaktimGhosh" && b == "Raktim"){
       
         alert("Login Successful")  
         window.location.href = 'about.html';   
    }else{
        alert("Login Failed")
    }
}