function par(){
    var num = parseFloat(document.getElementById('valor').value);

    if(num % 2 == 0){
        document.getElementById('res').innerText = 'O número ' + num + " é PAR";
    }else{
        document.getElementById('res').innerText = "O número " + num + " é ÍMPAR";
    }
}