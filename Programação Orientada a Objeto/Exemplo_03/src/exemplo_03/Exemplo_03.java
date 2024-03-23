package exemplo_03;

import java.util.Scanner;

public class Exemplo_03 {

    public static void main(String[] args) {
        double valor_total, parcela;
        int qtde_parcelas;

        
        Scanner dados = new Scanner(System.in);
     
        System.out.println("Digite o valor da compra: ");

        valor_total = dados.nextDouble();

        System.out.println("Quantidade de parcelas:");

        System.out.println("1 parcela");     

        System.out.println("2 parcela");     

        System.out.println("4 parcela");     

        System.out.println("6 parcela");     

        System.out.println("12 parcela");     

        System.out.println("24 parcela");     

        System.out.println("Digite a quantidade de parcelas:");

        qtde_parcelas = dados.nextInt();
        
        if(qtde_parcelas == 1){

              System.out.println("1 Parcela no valor de R$ " + valor_total);

            } else if (qtde_parcelas == 2){

              parcela = (valor_total * 1.02)/2;

              System.out.println("2 Parcelas no valor de R$ " + parcela);

            } else if (qtde_parcelas == 4){       

              parcela = (valor_total * 1.05)/4;

              System.out.println("4 Parcelas no valor de R$ " + parcela);

            } else if (qtde_parcelas == 6){

              parcela = (valor_total * 1.10)/6;

              System.out.println("6 Parcelas no valor de R$ " + parcela);

            } else if (qtde_parcelas == 12){

              parcela = (valor_total * 1.18)/12;

              System.out.println("12 Parcelas no valor de R$ " + parcela);

            } else if (qtde_parcelas == 24){         

              parcela = (valor_total * 1.26)/24;

              System.out.println("24 Parcelas no valor de R$ " + parcela);

            } else {

              System.out.println("Número de parcelas inválido!");           

            }
    }
    
}
