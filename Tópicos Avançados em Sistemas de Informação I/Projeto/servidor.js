var http = require('http');

http.createServer(function(req, res){
    res.end ("Aula de servidor");
}).listen(8081);
console.log("O servidor esta ok");