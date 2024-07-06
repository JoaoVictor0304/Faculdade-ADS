var http = require('http');

http.createServer(function(req, resp){
    resp.end("Bem vindo ao servidor!")
}).listen(8081);

console.log("Servidor funcionando");
