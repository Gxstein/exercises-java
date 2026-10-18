package ex20;

public class Invoice {
    private double basicPayment;
    private double tax;

    public Invoice(){

    }

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basiPayment) {
        this.basicPayment = basiPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public  double getTotalPayment(){
        return  getBasicPayment() - getTax();
    }

}

