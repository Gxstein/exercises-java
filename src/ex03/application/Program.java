package ex03.application;

import ex03.entities.Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Funcionarios funcionarios = new Funcionarios();

        System.out.print("Name: ");
        funcionarios.name = sc.nextLine();
        System.out.print("Grossy salary: ");
        funcionarios.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionarios.tax = sc.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f%n", funcionarios.name, funcionarios.netSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        funcionarios.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Update data: %s, $ %.2f%n", funcionarios.name, funcionarios.netSalary());



    }
}
