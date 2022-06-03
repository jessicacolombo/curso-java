import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
			
		} else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
			
		} else if (y == 0 && x != 0) {
			System.out.println("Eixo X");
			
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
			
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
			
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
			
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
			
		}
		
		scanner.close();
	}
}
