package vetor_exerc1;

public class Vetor_Exerc1 {

    public static void main(String[] args) {
        double[] vetor = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int N = vetor.length;
        
        System.out.println("Vetor original: ");
        imprimirVetor(vetor);
        
        inverter(vetor, N);
        
        System.out.println("Vetor invertido: ");
        imprimirVetor(vetor);
        
    }
    
    public static void inverter(double vet[], int N) {
        if (N > 0 && N <= vet.length) {
            for (int i = 0; i < N/2; i++) {
                double temp = vet[i];
                vet[i] = vet[N - 1 - i];
                vet[N - 1 -i] = temp;
            }
        }else {
            System.out.println("Valor de N inválido");
        }
    }
    
    public static void imprimirVetor(double vet[]) {
        for (double elemento : vet) {
            System.out.println(elemento + " ");
        }
        System.out.println();
    }
    
}
