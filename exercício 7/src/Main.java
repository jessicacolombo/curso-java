import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.print("São multiplos");
		} else if (A % B != 0 || B % A != 0) {
			System.out.print("Não são multiplos");
		}
		
		scanner.close();

	}

}
