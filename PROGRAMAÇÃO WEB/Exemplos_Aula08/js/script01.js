"use strict";

// funções matemáticas - pacote Math
let x = 4.568745;
let y = 4;

let z = Math.random() * 60; // gera de 0 a 1

console.log(x/y);
console.log(z);
// função arredondamento
console.log(Math.ceil(x/y)); // função teto
console.log(Math.floor(x/y)); // função solo
console.log(Math.round(x/y)); // arredonda a partir das casas decimais
console.log(Math.round(z));
console.log(z.toFixed(2));