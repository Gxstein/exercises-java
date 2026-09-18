package ex02.application;

import ex02.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do seu retangulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.println("Digite a altura do seu retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.addArea());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.addPerimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.addDiagonal());


    }
}
