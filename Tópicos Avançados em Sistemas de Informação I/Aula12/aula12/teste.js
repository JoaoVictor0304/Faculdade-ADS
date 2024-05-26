const Sequelize = require('sequelize');
const sequelize = new Sequelize('nodemysql', 'root', 'root', {
    host:"localhost",
    dialect:"mysql"
});

sequelize.authenticate().then(function(){
    console.log("Conectado ao banco");
}).catch(function(err){
    console.log("Falha na conexão" + err);
});

const postagem = sequelize.define('postagem',{
    titulo:{
        type: Sequelize.STRING
    },
    conteudo:{
        type: Sequelize.TEXT
    }
});

// postagem.sync({force:true});

postagem.create({
    titulo:"Enchente RS",
    conteudo:"Está chovendo novamente"
});

const usuario = sequelize.define('usuarios', {
    nome:{
        type: Sequelize.STRING
    },
    sobrenome:{
        type: Sequelize.STRING
    },
    idade:{
        type: Sequelize.INTEGER
    },
    email:{
        type: Sequelize.STRING
    }
});

usuario.create({
    nome:"João Victor",
    sobrenome:"Avelino",
    idade:25,
    email:"teste@teste.com"
});

// usuario.sync({force:true});