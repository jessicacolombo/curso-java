import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int codigo = scanner.nextInt();
		int quantidade = scanner.nextInt();
		
		if (codigo == 1) {
			System.out.printf("Total: %.2f%n", quantidade * 4);
		
		} else if (codigo == 2) {
			System.out.printf("Total: %.2f%n", quantidade * 4.5);
			
		} else if (codigo == 3) {
			System.out.printf("Total: %.2f%n", quantidade * 5);
			
		} else if (codigo == 4) {
			System.out.printf("Total: %.2f%n", quantidade * 2);
			
		} else if (codigo == 5) {
			System.out.printf("Total: %.2f%n", quantidade * 1.5);
			
		} else if (codigo > 5) {
			System.out.println("Entre um c�digo valido");
			
		}
		
		scanner.close();

	}

}
