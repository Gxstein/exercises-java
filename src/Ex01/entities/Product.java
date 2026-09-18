package Ex01.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
}
