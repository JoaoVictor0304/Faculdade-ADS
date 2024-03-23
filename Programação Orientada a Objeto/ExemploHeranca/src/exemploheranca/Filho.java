public class Filho extends Pai {
    
    public Filho(int a, int b, int c) {
        super(a, b, c);
    }

    public void imprimeFilho() {
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + getC());
    }
    
}
