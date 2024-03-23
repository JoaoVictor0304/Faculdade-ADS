package exemplo_01;

import java.util.Scanner;

public class Exemplo_01 {

    public static void main(String[] args) {
        double n1, n2, soma;
        
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        n1 = dados.nextDouble();
        System.out.println("Digite o segundo número");
        n2 = dados.nextDouble();
        
        soma = n1 + n2;
        
        if (soma >= 10){
            System.out.println("A soma é " + soma);
        }
        
        
    }
    
}
