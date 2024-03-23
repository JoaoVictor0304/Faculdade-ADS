package mediaalturamulher;

import java.util.Scanner;

public class MediaAlturaMulher {

    public static void main(String[] args) {
        double altura, mediaAltura = 0;
        String sexo, continua = "S";
        int qtde_homens = 0, qtde_mulheres = 0;
        Scanner dados = new Scanner(System.in);
        
        do {
            System.out.println("Digite o sexo: (M ou F): ");
            sexo = dados.next();
            if (sexo.equals("M")) {
                qtde_homens++;
            }
            System.out.println("Digite a sua altura: ");
            altura = dados.nextDouble();
            if (sexo.equals("F")) {
                mediaAltura += altura;
                qtde_mulheres++;
            }
            System.out.println("Deseja continuar? (S ou N): ");
            continua = dados.next();
        }while(continua.equals("S"));
        System.out.println("A quantidade de homens da pesquisa foi: " + qtde_homens);
        System.out.println("A média da estatura das mulheres é: " + (mediaAltura/qtde_mulheres));
    }
    
}
