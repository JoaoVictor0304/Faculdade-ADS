package mergepaises;

import java.util.Arrays;

public class MergePaises {
    
    String veta[] = { "Angola", "Chile", "Grécia", "Itália", "Moçambique", "Portugal","Rússia", "Suécia" };
    String vetb[] = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França","Inglaterra", "Turquia", "Uruguai" };
    String res[] = new String[veta.length + vetb.length];

    public static void main(String[] args) {
        new MergePaises();
    }
    
    public MergePaises() {
        mergePaises(veta, vetb, res);
        System.out.println(Arrays.toString(res));
    }
    
    public void mergePaises(String a[], String b[], String res[]) {
        int i=0, j=0, k=0;
        
        while(i < veta.length && j < vetb.length) { //ciclo para fusão inicial
            if (a[i].compareTo(b[j]) < 0) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }
        
        while(i < a.length) { //para pegar e colocar em res[] os itens remanescentes a[]
            res[k++] = a[i++];
        }
        
        while(j < b.length) { //para pegar e colocar em res[] os itens remanescentes de b[]
            res[k++] = b[j++];
        }
    }
    
}
