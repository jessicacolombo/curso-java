import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("PAR");
		} else if (number % 2 != 0) {
			System.out.println("ÍMPAR");
		}

		scanner.close();
	}

}
