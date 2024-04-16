const http = require('http')
const fs = require('fs');
const port = 8180;


const server=http.createServer((req, res)=>{
  fs.readFile('./quizz/database.html', (err, arquivo)=>{
    res.writeHead(200, {'Content-Type':'text/html'})
    res.write(arquivo)
    return res.end()
  })
})

server.listen(port, ()=>{
  console.log('Servidor iniciado com sucesso!');
})