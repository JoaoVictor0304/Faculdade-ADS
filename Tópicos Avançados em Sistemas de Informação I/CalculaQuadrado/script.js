function calcularQuadrado() {
    // Ler os valores dos campos de entrada
    var valor1 = parseFloat(document.getElementById('val1').value);
    var valor2 = parseFloat(document.getElementById('val2').value);
    var valor3 = parseFloat(document.getElementById('val3').value);

    // Calcular o quadrado de cada valor
    var quadrado1 = valor1 * valor1;
    var quadrado2 = valor2 * valor2;
    var quadrado3 = valor3 * valor3;

    // Exibir os resultados
    document.getElementById('resultado').innerText = "Quadrado de " + valor1 + ": " + quadrado1 + "\n" + "Quadrado de " + valor2 + ": " + quadrado2 + "\n" + "Quadrado de " + valor3 + ": " + quadrado3;
}