package exercicios;
public class Exercicios {

    public static void main(String args[]) {
        new Exercicios();
    }

    public Exercicios() {
        double a[] = {10, 20, 30, 40, -20}; //vetor de valores reais
        visualizaVetor("Vetor de valores reais", a);
        double res = calcularSomaDosElementos(a);
        System.out.println("A soma de todos os valores e: " + res);
        double resp = calcularSomaDosElementosPositivos(a);
        System.out.println("A soma dos valores positivos: " + resp);
    }
    
    double calcularSomaDosElementosPositivos(double vet[]) {
            double soma = 0;
            for(int i=0; i < vet.length; i++) {
                if(vet[i] > 0){
                    soma += vet[i]; 
                }
            }
            return soma;
    }

     double calcularSomaDosElementos(double vet[]) {
         double soma = 0;
         for(int i=0; i < vet.length; i++) {
             soma += vet[i];
         }
         return soma; // retorna a soma dos valores do vetor
     }

    public void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }

}
