
package aula05exercicio01;

import java.util.Scanner;

public class Aula05Exercicio01 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente(1500, "Zé", "9999-99999");
        System.out.println("Dados do cliente" + c1.toString());
        
        Cliente c2 = new Cliente();
        
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        c2.setNome(dados.nextLine());
        System.out.println("Digite seu Telefone:");
        c2.setFone(dados.nextLine());
        System.out.println("Digite o valor da Dívida:");
        c2.setValorDivida(dados.nextFloat());
        
        System.out.println("Dados do cliente" + c2.toString());
    }
    
}
