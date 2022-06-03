import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int raio = scanner.nextInt();
		
		double pi = 3.14159; 
		double area = pi * raio * raio;
		
		Locale.setDefault(Locale.US);
		System.out.printf("area do círculo = %.4f%n" , area);
		scanner.close();

	}

}
