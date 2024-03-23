
package aula05exercicio01;

public class Cliente extends Pessoa {
    private float valorDivida;

    public Cliente() {
    }

    public Cliente(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente(float valorDivida, String nome, String fone) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + getNome() + ", fone=" + getFone() + " valorDivida=" + valorDivida + '}';
    }
    
    
}
