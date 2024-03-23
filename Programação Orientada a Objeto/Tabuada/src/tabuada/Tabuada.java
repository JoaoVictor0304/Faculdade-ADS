package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int i, valor, mult;
        
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Entre com um número inteiro:");
        valor = dados.nextInt();
        
        for(i = 0; i < 11; i++) {         
            mult = valor * i;
            System.out.println(valor + " x " + i + " = " + mult);
        }
    }
    
}
