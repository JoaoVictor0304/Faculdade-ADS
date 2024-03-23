package estruturawhile;

import java.util.Scanner;

public class EstruturaWhile {

    public static void main(String[] args) {
        int i, n, positivo = 0, negativo = 0, valor;
        
        System.out.println("Digite a quantidade de valores a serem processados:");
        Scanner dados = new Scanner(System.in);
        n = dados.nextInt();
        i = 1;
        
        while(i<=n) {
            System.out.println("Digite um valor:");
            valor = dados.nextInt();
            if (valor >= 0) {
                positivo += 1;
            }else{
                negativo += 1;
            }
            i += 1;
        }
        System.out.println("A quantidade de números positivos digitados foi: " + positivo);
        System.out.println("A quantidade de números negativos digitados foi: " + negativo); 
    }
    
}
