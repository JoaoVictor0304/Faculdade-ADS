const express = require('express');
const path = require('path');
const { engine } = require('express-handlebars');

const app = express();
const port = 8081;

app.engine('hbs', engine({ extname: '.hbs' }));
app.set('view engine', 'hbs');
app.set('views', path.join(__dirname, '/views'));

app.use(express.static(path.join(__dirname, 'public')));

app.get('/', (req, res) => {
    res.render('home');
});

app.get('/dashboard', (req, res) => {
    res.render('dashboard', { imagePath: '/image/msg.png' });
});


app.listen(port, ()=> {
    console.log('Servidor rodando na porta 8081');
});