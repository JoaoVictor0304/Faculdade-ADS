"use strict";

document.querySelector("#btn1").addEventListener("click",
    function(){
        let info = document.querySelector("#text").value;
        inverter(info);
        inserirSimbolo(info, "*");
    }
)

function inverter(str){
    console.log(str.length); // quantidade de caracteres
    let saida = ""; // string vazia
    for(let i = str.length - 1; i >= 0; i--){
        saida += str[i].toUpperCase(); // caracteres em maiúsculo
    }
    console.log(saida);
}

function inserirSimbolo(str, simbolo){
    let saida = "";
    for(let i = 0; i < str.length; i++){
        saida += str[i] + simbolo;
    }
    console.log(saida);
}