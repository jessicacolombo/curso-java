import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			int row1 = i;
			int row2 = i * i;
			int row3 = i * i * i; 
			System.out.printf("%d %d %d %n", row1, row2, row3);
		}
		
		scanner.close();
	}

}
