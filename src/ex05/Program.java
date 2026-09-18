package ex05;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double quotation = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(quotation, quantity));

        sc.close();
    }
}
