package vetor_exerc2;

import java.util.ArrayList;
import java.util.Collections;

public class Vetor_Exerc2 {

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        //Lista impar
        /*arrayList.add(4.3);
        arrayList.add(6.1);
        arrayList.add(0.1);
        arrayList.add(1.9);
        arrayList.add(2.4);
        arrayList.add(7.2);
        arrayList.add(5.5);*/
        
        //Lista par
        arrayList.add(67.3);
        arrayList.add(7.9);
        arrayList.add(5.1);
        arrayList.add(1.8);
        arrayList.add(11.4);
        arrayList.add(98.2);
        
        System.out.println("ArrayList original: ");
        imprimirArrayList(arrayList);
        
        inverter(arrayList);
        
        System.out.println("ArrayList invertida: ");
        imprimirArrayList(arrayList);
        
    }
    public static void inverter(ArrayList<Double> arr) {
        Collections.reverse(arr);
    }
    
    public static void imprimirArrayList(ArrayList<Double> arr) {
        for (double elemento : arr){
            System.out.println(elemento + " ");
        }
        System.out.println();
    }
    
}
