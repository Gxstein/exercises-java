package ex18.application;

import ex18.entities.Contador;
import ex18.entities.PessoaFisica;
import ex18.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contador> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int quantidadeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(name, rendaAnual, quantidadeFuncionarios));
            }
        }

        double total = 0.0;

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contador c : list) {
            System.out.println(String.format("%s: $ %.2f", c.getName(), c.calculoImposto()));
            total += c.calculoImposto();
        }

        System.out.println();
        System.out.println(String.format("TOTAL TAXES: $ %.2f", total));

        sc.close();
    }
}