import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int dupla1 = scanner.nextInt();
			int dupla2 = scanner.nextInt();
			
			if (dupla2 == 0) {
				System.out.print("divis�o imposs�vel");
				
			} else {
				double div = (double) dupla1 / dupla2;
				System.out.printf("%.1f%n", div);
			}
		}
	}

}
