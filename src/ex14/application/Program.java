package ex14.application;

import ex14.entities.Client;
import ex14.entities.Order;
import ex14.entities.OrderItem;
import ex14.entities.Product;
import ex14.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        int x = sc.nextInt();

        Client client = new Client(name, email, birthDate);
        Order order = new Order(new Date(), status, client);

        for (int i = 0; i < x; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            Double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();

            Product product = new Product(nameProduct, priceProduct);
            OrderItem orderItem = new OrderItem(quantityProduct, priceProduct, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}