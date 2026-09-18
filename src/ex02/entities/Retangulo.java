package ex02.entities;

public class Retangulo {
    public double altura;
    public double largura;

    public double addArea(){
        return altura * largura;
    }
    public double addPerimetro(){
        return 2 * (altura + largura);
    }
    public double addDiagonal(){
        return Math.sqrt(altura * altura + largura * largura);
    }

}
