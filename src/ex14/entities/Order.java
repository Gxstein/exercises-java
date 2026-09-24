package ex14.entities;

import ex14.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");


    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order(){

    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem (OrderItem addItem){
        items.add(addItem);
    }

    public void removeItem (OrderItem removeItem){
        items.remove(removeItem);
    }

    public double total(){
        Double totalValue = 0.0;
        for (OrderItem it : items){
            totalValue += it.subTotal();
        }

        return totalValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() +
                " (" + sdf2.format(client.getBirthDate()) + ") - " +
                client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem it : items) {
            sb.append(it.getProduct().getName() +
                    ", $" + it.getProduct().getPrice() +
                    ", Quantity: " + it.getQuantity() +
                    ", Subtotal: $" + it.subTotal() +
                    "\n");
        }
        sb.append("Total price: $" + total());
        return sb.toString();
    }

}
