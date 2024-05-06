const express = require('express');
const exphbs = require('express-handlebars');

const app = express();

const hbs = exphbs.create({});
app.engine('handlebars', hbs.engine);
app.set('view engine', 'handlebars');

app.get('/', (req, res) => {
    const user={
        name:"Joao",
        surname:"Avelino",
        age: 25
    }

app.get("/dashboard", function(req, res){
    res.render("dashboard");
});

    const palavra = "PASSANDO VALORES";
    const auth = true;
    
    res.render('home', {user:user, palavra, auth});
});

app.listen(8081, ()=> {
    console.log('Servidor rodando na porta 8081');
});
