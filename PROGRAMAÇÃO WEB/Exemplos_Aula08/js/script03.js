"use strict";

let cx1, cx2;
cx1 = document.querySelector("#caixa1");
cx2 = document.querySelector("#caixa2");

cx1.addEventListener("click", tratarEvento);
cx1.addEventListener("dblclick", tratarEvento);
cx2.addEventListener("mouseover", tratarEvento);
cx2.addEventListener("mouseout", tratarEvento);
cx2.addEventListener("mousedown", tratarEvento);
cx2.addEventListener("mouseup", tratarEvento);


function tratarEvento(event){ // objeto do tipo evento
    // verifica qual o tipo do evento
    switch(event.type){
        case "click":
            cx1.style.backgroundColor = "green";
            break;
        case "dblclick":
            cx1.style.backgroundColor = "blue";
            break;
        case "mouseover":
            cx2.style.backgroundColor = "red";
            break;
        case "mouseout":
            cx2.style.backgroundColor = "pink";
            break;
        case "mousedown":
            cx2.style.backgroundColor = "brown";
            break;
        case "mouseup":
            cx2.style.backgroundColor = "orange";
            break;
    }
}