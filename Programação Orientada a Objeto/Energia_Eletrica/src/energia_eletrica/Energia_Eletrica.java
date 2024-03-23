package energia_eletrica;

public class Energia_Eletrica {
    private double consumo, fornecimento, icms, cofins, pispasesp, icmscofis, icmspispasesp, fatura;

    public Energia_Eletrica(double consumo) {
        this.setConsumo(consumo);
    }
       
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getFornecimento() {
        return fornecimento;
    }

    public void setFornecimento(double consumo) {
        this.setfornecimento(consumo * 0.28172);
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double consumo, double fornecimento) {
        if (consumo <= 200) {
            this.seticms(fornecimento * 0.136363);
        }else{
            this.setIcms(fornecimento * 0.333333);
        }
    }

    public double getCofins() {
        return cofins;
    }

    public void setCofins(double cofins) {
        this.cofins = cofins;
    }

    public double getPispasesp() {
        return pispasesp;
    }

    public void setPispasesp(double pispasesp) {
        this.pispasesp = pispasesp;
    }

    public double getIcmscofis() {
        return icmscofis;
    }

    public void setIcmscofis(double icmscofis) {
        this.icmscofis = icmscofis;
    }

    public double getIcmspispasesp() {
        return icmspispasesp;
    }

    public void setIcmspispasesp(double icmspispasesp) {
        this.icmspispasesp = icmspispasesp;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }

    private void setfornecimento(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void seticms(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
