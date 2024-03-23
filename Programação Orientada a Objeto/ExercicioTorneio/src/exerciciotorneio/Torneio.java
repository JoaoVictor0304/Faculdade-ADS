package exerciciotorneio;

import javax.swing.JOptionPane;

public class Torneio {
    String nome;
    int idade;

    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String verificarCategoria(){
        if (idade >= 5 && idade <= 7) {
            return "Infantil";
        }
        
        if (idade >= 8 && idade <=10) {
            return "Juvenil";
        }
        
        if (idade >= 11 && idade <= 15) {
            return "Adolescente";
        }
        
        if (idade >= 16 && idade <= 30) {
            return "Adulto";
        }
        
        if (idade >= 30) {
            return "Sênior";
        }
        
        return "Idade inválida";
    }
    
    public void ExibirDados() {
        String categoria = verificarCategoria();
        String mensagem = "Nome: " + nome + "\nIdade: " + idade + "\nCategoria: " + categoria;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}



