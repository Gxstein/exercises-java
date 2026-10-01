package ex18.entities;

public class PessoaFisica extends Contador{
    private Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculoImposto() {
        if(getRendaAnual() < 20000.0){
            return getRendaAnual() * 0.15 - (getGastosSaude() * 0.50);
        } else {
            return getRendaAnual() * 0.25 - (getGastosSaude() * 0.50);
        }

    }
}
