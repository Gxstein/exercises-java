package ex06.entities;

public class Account {

    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Account(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}