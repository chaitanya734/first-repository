function func(){
     color="#" + Math.floor(Math.random()*16777215).toString(16).padStart(6, '0').toUpperCase();
     document.body.style.backgroundColor=color;
     document.getElementById("one").innerText =color;
 }
