package mediatemperatura;

import java.util.Scanner;

public class MediaTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor para armazenar as temperaturas dos 7 dias
        double[] temperaturas = new double[7];

        // Pedindo ao usuário para inserir as temperaturas dos 7 dias
        System.out.println("Insira a temperatura diária dos últimos 7 dias:");

        double somaTemperaturas = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            somaTemperaturas += temperaturas[i];
        }

        // Calculando a média das temperaturas semanais
        double mediaSemanal = somaTemperaturas / 7;
        System.out.println("A média da temperatura semanal é: " + mediaSemanal);

        // Contando quantos dias a temperatura ficou acima e abaixo da média semanal
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > mediaSemanal) {
                acimaDaMedia++;
            } else if (temperaturas[i] < mediaSemanal) {
                abaixoDaMedia++;
            }
        }

        // Exibindo os resultados
        System.out.println("Dias com temperatura acima da média: " + acimaDaMedia);
        System.out.println("Dias com temperatura abaixo da média: " + abaixoDaMedia);

        scanner.close();
    }
    
}
