import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int start = scanner.nextInt();
		int end = scanner.nextInt(); 
		
		if (start < end) {
			System.out.printf("o jogo durou %d hora(s)", end - start);
		} else if (end < start) {
			System.out.printf("o jogo durou %d hora(s)", 24 - start + end);
		}
		
		scanner.close();

	}

}
