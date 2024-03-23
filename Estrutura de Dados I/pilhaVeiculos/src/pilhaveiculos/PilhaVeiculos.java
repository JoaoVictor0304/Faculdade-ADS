package pilhaveiculos;

public class PilhaVeiculos {
    
    private static class Node {
        veiculo data;
        Node next;

        Node(veiculo data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public PilhaVeiculos() {
        this.top = null;
    }

    public void push(veiculo veiculo) {
        Node newNode = new Node(veiculo);
        newNode.next = top;
        top = newNode;
    }

    public veiculo pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia");
            return null;
        }
        
        veiculo veiculo = top.data;
        top = top.next;
        return veiculo;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        PilhaVeiculos pilhaVeiculos = new PilhaVeiculos();
        
        // Adicionando objetos Veículo à pilha
        pilhaVeiculos.push(new veiculo("ABC1234", "Ford", "Fiesta", 2018));
        pilhaVeiculos.push(new veiculo("XYZ5678", "Chevrolet", "Onix", 2020));
        pilhaVeiculos.push(new veiculo("DEF9012", "Volkswagen", "Gol", 2019));

        // Retirando e mostrando os dados dos objetos Veículo da pilha
        while (!pilhaVeiculos.isEmpty()) {
            veiculo veiculo = pilhaVeiculos.pop();
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano de Fabricação: " + veiculo.getAnoFabricacao());
            System.out.println();
        }
    }
    
}

class veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public veiculo(String placa, String marca, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
             
}
