package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("E-mail: ");
		String email = scanner.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(scanner.next());
		Client client = new Client(name, email, birthdate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scanner.next());
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int thisManyItens = scanner.nextInt(); 
		
		for (int i = 1; i <= thisManyItens; i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.print("Product name: ");
			scanner.nextLine();
			String productName = scanner.nextLine();
			System.out.print("Product price: ");
			double productPrice = scanner.nextDouble();
			Product product = new Product (productName, productPrice);
			
			System.out.println("Quantity: ");
			int productQntt = scanner.nextInt();
			OrderItem orderItem = new OrderItem (product, productQntt, productPrice);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		scanner.close();

	}

}
