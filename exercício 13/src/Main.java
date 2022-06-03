import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.print("Primeiro");
				
			} else if (x < 0 && y > 0) {
				System.out.print("Segundo");
				
			} else if (x < 0 && y < 0) {
				System.out.print("Terceiro");
			
			} else if (x > 0 && y < 0) {
				System.out.print("Quarto");
			
			}
			
			x = scanner.nextInt();
			y = scanner.nextInt(); 
		}
		
		scanner.close();
	}

}
