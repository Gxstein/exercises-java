package ex18.entities;

public abstract class  Contador {
    private String name;
    private Double rendaAnual;

    public Contador() {
    }

    public Contador(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double calculoImposto();

    public void totalTax(){
    }

}
