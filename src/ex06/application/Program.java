package ex06.application;

import ex06.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        if (answer == 'y' || answer == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initial = sc.nextDouble();
            account = new Account(number, holder, initial);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}