package exemplo_02;

import java.util.Scanner;

public class Exemplo_02 {

    public static void main(String[] args) {
        double  valParc, valCom, juros;
        int qtdeParc;
        
        Scanner dados = new Scanner(System.in);
        System.out.println("Entre com o valor da compra:");
        valCom = dados.nextDouble();
        System.out.println("Entre com a quantidade de parcelas 1,2,4,6,12 ou 24");
        qtdeParc = dados.nextInt();
        
        switch (qtdeParc){
            case 1:
                System.out.println("O valor da parcela fica: " + valCom);
                break;
            case 2:
                juros = 0.02;
                valParc = (valCom+valCom*juros)/2;
                System.out.println("Você dividiu em 2 vezes e a parcela fica: " + valParc);
                break;
            case 4:
                juros = 0.05;
                valParc = (valCom+valCom*juros)/4;
                System.out.println("Você dividiu em 4 vezes e a parcela fica: " + valParc);
                break;
            case 6:
                juros = 0.10;
                valParc = (valCom+valCom*juros)/6;
                System.out.println("Você dividiu em 6 vezes e a parcela fica: " + valParc);
                break;
            case 12:
                juros = 0.18;
                valParc = (valCom+valCom*juros)/12;
                System.out.println("Você dividiu em 12 vezes e a parcela fica: " + valParc);
                break;
            case 24:
                juros = 0.26;
                valParc = (valCom+valCom*juros)/24;
                System.out.println("Você dividiu em 24 vezes e a parcela fica: " + valParc);
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }
    }
    
}
