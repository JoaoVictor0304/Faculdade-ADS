function alteraTitulo(){
	let texto = document.querySelector("#titulo").value;
    document.querySelector("#tit").innerHTML = texto;
    // alterar propriedades CSS
    document.querySelector("#tit").style.color = "blue";
    document.querySelector("#tit").style.fontSize = "50pt";
}

function criaTabela(){
	let lin = document.querySelector("#linha").value;
    let c = document.querySelector("#coluna").value;
    let conteudo = "<table border = '1'>";
    // criar linhas
    for(let i = 1; i <= lin; i++){
        conteudo += "<tr>";
        // criar as colunas
        for(let j = 1; j <= c; j++){
            conteudo += "<td>" + i + "," + j + "</td>";
        }
        conteudo += "</tr>";
    }
    conteudo += "</table>";
    document.querySelector("#tab").innerHTML = conteudo;
}

document.querySelector("#button").onclick = alteraTitulo;

document.querySelector("#button2").onclick = criaTabela;

// button.onclick = alteraTitulo;

