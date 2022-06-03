import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int senha = scanner.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = scanner.nextInt();
				
		}
		
		System.out.println("Acesso permitido");
		
		scanner.close();

	}

}
