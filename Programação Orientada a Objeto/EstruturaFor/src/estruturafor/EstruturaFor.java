package estruturafor;

import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {
        int i, n, valor, soma;
        
        System.out.println("Digite a quantidade de valores a serem processados: ");
        Scanner dados = new Scanner(System.in);
        n = dados.nextInt();
        soma = 0;
        for(i = 1; i <= n; i++) {
            System.out.println("Digite o valor: ");
            valor = dados.nextInt();
            soma += valor;
        }
        System.out.println("O valor da média dos valores digitados é: " + (soma/n));
    }
    
}
