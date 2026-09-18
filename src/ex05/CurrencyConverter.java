package ex05;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converter(double quotation, double quantity) {
        double real = quotation * quantity;
        double tax = real * IOF;
        return real + tax;
    }


}
