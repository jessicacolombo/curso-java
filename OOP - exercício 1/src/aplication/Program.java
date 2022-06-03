package aplication;

import java.util.Scanner;
import java.util.Locale; 
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		System.out.println("Enter width of the rectangle: ");
		rectangle.width = scanner.nextDouble();
		System.out.println("Enter height of the rectangle: ");
		rectangle.height = scanner.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
		
		scanner.close();
	}

}
