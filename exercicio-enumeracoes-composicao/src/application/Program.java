package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.next());
		sc.nextLine();
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));

		System.out.print("How many items for this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();

			OrderItem products = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			order.addItem(products);
		}
		System.out.println("Order Summary");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + " ("
				+ sdf1.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail());

		System.out.println("Order Items");
		order.getItems().forEach(item -> {
			System.out.println(item.getProduct().getName() + ", $" + item.getProduct().getPrice() + ", Quantity: "
					+ item.getQuantity() + ", Subtotal: $" + item.subTotal());
		});
		System.out.println("Total Price: " + order.total());
		sc.close();
	}

}
