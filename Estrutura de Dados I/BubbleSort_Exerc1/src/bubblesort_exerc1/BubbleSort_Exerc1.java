package bubblesort_exerc1;

public class BubbleSort_Exerc1 {
   
    public static void main(String[] args) {
        String paises[] = {"Mexico", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};
        
        System.out.println("Array antes da ordenacao: ");
        printArray(paises);
        
        bubbleSortPaises(paises);
        
        System.out.println("Array depois de ser ordenada: ");
        printArray(paises);
        
    }
    
    public static void bubbleSortPaises(String[] array) {
        int n = array.length;
        boolean trocar;
        
        do{
            trocar = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i].compareToIgnoreCase(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocar = true;
                }
            }
        }while(trocar);
            
    }
    
    public static void printArray(String[] array) {
        for (String paises : array) {
            System.out.println(paises + " ");
        }
        System.out.println();
    }
    
    
}
