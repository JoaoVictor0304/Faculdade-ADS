
function inserirNome(){
    var seuNome = document.getElementById("nome").value;
    var saida = document.getElementById("saida");
    saida.innerHTML = seuNome;
    saida.classList.add("meunome");
}