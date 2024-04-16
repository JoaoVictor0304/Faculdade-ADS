function ordenarValores() {
    // Ler os valores dos campos de entrada
    var valor1 = parseFloat(document.getElementById('val1').value);
    var valor2 = parseFloat(document.getElementById('val2').value);
    var valor3 = parseFloat(document.getElementById('val3').value);
    var valor4 = parseFloat(document.getElementById('val4').value);
    var valor5 = parseFloat(document.getElementById('val5').value);

    // Colocar os valores em um array
    var valores = [valor1, valor2, valor3, valor4, valor5];

    // Ordenar os valores em ordem crescente
    valores.sort(function(a, b){return a - b});

    // Exibir os valores ordenados
    document.getElementById('resultado').innerText = "Valores em ordem crescente: " + valores.join(", ");
}