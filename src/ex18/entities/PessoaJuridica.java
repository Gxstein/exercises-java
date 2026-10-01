package ex18.entities;

public class PessoaJuridica extends Contador {
    private int quantidadeFuncionarios;

    public PessoaJuridica(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public PessoaJuridica() {

    }

    public PessoaJuridica(String name, Double rendaAnual, int quantidadeFuncionarios) {
        super(name, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double calculoImposto() {
        if (quantidadeFuncionarios > 10){
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}
