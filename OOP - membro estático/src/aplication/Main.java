package aplication;

import java.util.Scanner; 
import java.util.Locale;
import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarCotation = scanner.nextDouble();
		System.out.println("How many dollars will be bought?");
		double quantityOfDollars = scanner.nextDouble();
		
		double conversion = CurrencyConverter.dollarConversor(quantityOfDollars, dollarCotation);
		
		System.out.printf("Amoount to be paid: %.2f", conversion);
		
		scanner.close();
	}

}
