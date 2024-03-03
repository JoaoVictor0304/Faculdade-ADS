package selectionsort_exerc2;

public class SelectionSort_Exerc2 {

    public static void main(String[] args) {
        int numeros[] = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        
        System.out.println("Array desordenada:");
        printArray(numeros);
        
        selectionSort(numeros);
        
        System.out.println("Array ordenada decrescente:");
        printArray(numeros);
        
        
    }
    
    public static boolean selectionSort(int vetor[]) {
        if (vetor == null) return false;
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] > vetor[min]) {
                    min = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
        return true;
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
    
}
