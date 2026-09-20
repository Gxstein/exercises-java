package ex01.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public Product(String name, double price, int quantity){
        // construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totaValueInStock(){
       return price * quantity;
    }
    public void Addproducts (int quantity){
        this.quantity += quantity;
        // recebe ele mesmo mais a quantidade
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
        // recebe ele mesmo menos a quantidade
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "  + totaValueInStock();
    }
}
