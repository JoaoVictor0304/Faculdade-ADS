"use strict";
let nro = [];

function insereInicio(num){
    // insere valor no inicio do vetor
    nro.unshift(num);
    alert("Número armazenado com sucesso!");
}
function mostrar(){
    let txt = ""; // string vazia
    let i;
    for(i = 0; i < nro.length; i++){
        txt += i + " - " + nro[i] + "<br>";
    }
    return txt;
}
function insereFim(num){
   // insere o valor no final do vetor
   nro.push(num);
   alert("Número armazenado com sucesso!");
}
function retiraFim(){
   // retira o valor no final do vetor
   nro.pop();
   alert("Número retirado com sucesso!");
}
function retiraInicio(){
   // retira o valor do início do vetor
   nro.shift();
   alert("Número retirado com sucesso!");
}
//eventos dos botões
let btnInicio = document.querySelector("#inicio");
btnInicio.addEventListener("click", function(){
    let n = Number(document.querySelector("#valor").value);
    insereInicio(n);
});

let btnExibir = document.querySelector("#mostrar");
btnExibir.addEventListener("click", function(){
    let valores = mostrar();
    document.querySelector("#texto").innerHTML = valores;
});

let btnFim = document.querySelector("#fim");
btnFim.addEventListener("click", function(){
    let n = Number(document.querySelector("#valor").value);
    insereFim(n);
});

let btnRetiraF = document.querySelector("#retiraf");
btnRetiraF.addEventListener("click", retiraFim);

let btnRetiraI = document.querySelector("#retirai");
btnRetiraI.addEventListener("click", retiraInicio);
