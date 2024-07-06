const express = require('express');

const app = express();

app.get("/", function(req, resp){
    resp.send("Bem vindo ao céu!");
});

app.get("/contato", function(req, resp){
    resp.send("Página de contato!");
});

app.get("/produto", function(req, resp){
    resp.send("Página de produto!");
});

app.get("/dados/:nome/:cargo", function(req, resp){
    resp.send("<h1>Boa noite " + req.params.nome + "</h1><h2>Seu cargo é " + req.params.cargo + "</h2>");
});

app.get("/home", function(req, resp){
    resp.sendFile(__dirname+"/html/index.html");
});

app.listen(8081, function(){
    console.log("Servidor utilizando express")
});

