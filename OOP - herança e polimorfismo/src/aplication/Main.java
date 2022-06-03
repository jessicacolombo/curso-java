package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = scanner.nextInt();
		
		for (int i = 1; i <= numberOfProducts; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char productState = scanner.next().charAt(0);
			scanner.nextLine();
			
			if (productState != 'c' && productState != 'u' && productState != 'i') {
				System.out.print("Please enter a valid command: common, used or imported (c/u/i)?");
				productState = scanner.next().charAt(0);
				scanner.nextLine();
			}
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			
			if (productState == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(scanner.next());
				list.add(new UsedProduct(name, price, date));
				
			} else if (productState == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				
			} else {
				list.add(new Product(name, price));
			
			}	
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		scanner.close();
	}

}
