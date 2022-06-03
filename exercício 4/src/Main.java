import java.util.Scanner; 
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in); 
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		
		double pi = 3.14159;
		double triangulo = A * C; 
		double circulo = pi * C * C;
		double trapezio = (A + B) * C /2; 
		double quadrado = B * B; 
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.4f%n", triangulo);
		System.out.printf("CIRCULO: %.4f%n", circulo);
		System.out.printf("TRAPEZIO:  %.4f%n", trapezio);
		System.out.printf("QUADRADO:  %.4f%n", quadrado);
		System.out.printf("RETANGULO:  %.4f%n", retangulo);
		
		scanner.close();
	}

}
