package buscabinariabuscasequencial;

public class BuscaBinariaBuscaSequencial {

    public static void main(String[] args) {
        String[] paisesA = { "Ucrânia", "Turquia", "Suíça", "México", "França", "Espanha",
                             "Chile", "Brasil", "Argentina" };
        String[] paisesB = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França",
                             "Inglaterra", "Turquia", "Uruguai" };
        String[] paisesC = { "Canadá", "Áustria", "Chile", "Itália", "Portugal", "Grécia",
                             "Angola", "Moçambique", "Rússia" };
        
        // Testando busca binária em lista decrescente
        System.out.println("Busca binária em lista decrescente em paises A:");
        System.out.println("Posição do Suíça: " + buscaBinariaEmListaDecrescente(paisesA, "Suíça"));
        
        // Testando busca binária em lista crescente
        System.out.println("\nBusca binária em lista crescente em paises B:");
        System.out.println("Posição da Espanha: " + buscaBinariaEmListaCrescente(paisesB, "Espanha"));
          
        // Testando busca sequencial
        System.out.println("\nBusca sequencial em paises C:");
        System.out.println("Posição da Áustria: " + buscaSequencial(paisesC, "Áustria"));
    }
    
    // Método de busca sequencial
    public static int buscaSequencial(String[] vet, String buscado) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].equalsIgnoreCase(buscado)) {
                return i; // Retorna o índice se encontrar o elemento
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }
    
    // Método de busca binária em lista crescente
    public static int buscaBinariaEmListaCrescente(String[] vet, String buscado) {
        int inicio = 0;
        int fim = vet.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = vet[meio].compareToIgnoreCase(buscado);
            
            if (comparacao == 0) {
                return meio; // Retorna o índice se encontrar o elemento
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return -1; // Retorna -1 se o elemento não for encontrado
    }
    
    // Método de busca binária em lista decrescente
    public static int buscaBinariaEmListaDecrescente(String[] vet, String buscado) {
        int inicio = 0;
        int fim = vet.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = vet[meio].compareToIgnoreCase(buscado);
            
            if (comparacao == 0) {
                return meio; // Retorna o índice se encontrar o elemento
            } else if (comparacao > 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return -1; // Retorna -1 se o elemento não for encontrado
    }
}
