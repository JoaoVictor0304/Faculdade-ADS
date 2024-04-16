function media() {
    var valor1 = parseFloat(document.getElementById('val1').value);
    var valor2 = parseFloat(document.getElementById('val2').value);

    var res = (valor1 + valor2)/2

    document.getElementById('resultado').innerText = "A média entre os dois números é: " + res;

}