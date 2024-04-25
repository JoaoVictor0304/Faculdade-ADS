package aula_08_vetor;

public class Aula_08_Vetor {
    
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);
        
       try{
           vetor.adiciona("Elemento 1");
           vetor.adiciona("Elemento 2");
           vetor.adiciona("Elemento 3");
           vetor.adiciona("Elemento 4");
           vetor.adiciona("Elemento 5");
           vetor.adiciona("Elemento 6");
           vetor.adiciona("Elemento 7");
       }catch(Exception e){
           e.printStackTrace();
       }
       
        System.out.println("Tamanho do Vetor: " + vetor.tamanho());
        System.out.println("Dados do Vetor: " + vetor.toString());
        System.out.println("Busca por posicao: " + vetor.busca(1));
        System.out.println("Busca por elemento: " + vetor.busca1("Elemento 1"));
        vetor.adicionaInicio(0, "Elemento 0");
        
        System.out.println("Dados do Vetor: " + vetor.toString());
        
    }
    
}
