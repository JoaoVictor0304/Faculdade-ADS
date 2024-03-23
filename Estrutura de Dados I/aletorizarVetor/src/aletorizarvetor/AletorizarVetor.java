package aletorizarvetor;

public class AletorizarVetor {

    public void embaralhar(double[] v) {
        int n = v.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1)); // gera um índice aleatório entre 0 e i (inclusive)
            // troca v[i] com v[j]
            double temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
    
    public static void main(String[] args) {
        double[] vetor = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        AletorizarVetor aletorizarVetor = new AletorizarVetor(vetor);
    }
    
    public AletorizarVetor(double vet[]) { //construtor, com a lógica principal
        System.out.print("Antes de embaralhar: ");
        for (double n : vet) {
            System.out.print(n + " ");
        }
        System.out.println();
        embaralhar(vet);
        System.out.print("Depois de embaralhar: ");
        for (double n : vet) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
}
