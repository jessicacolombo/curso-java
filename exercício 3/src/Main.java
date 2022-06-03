import java.util.Scanner; 
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int cod1 = scanner.nextInt();
		int pieces1 = scanner.nextInt();
		double val1 = scanner.nextDouble();
		int cod2 = scanner.nextInt();
		int pieces2 = scanner.nextInt();
		double val2 = scanner.nextDouble();
		
		double total = pieces1 * val1 + pieces2 * val2; 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		scanner.close();

	}

}
