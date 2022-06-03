import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int escolhaDoCliente = scanner.nextInt();
		
		int alcool = 0; 
		int gasolina = 0; 
		int diesel = 0; 
		
		while (escolhaDoCliente != 4) {
			
			if (escolhaDoCliente == 1) {
				alcool += 1;
				
			} else if (escolhaDoCliente == 2) {
				gasolina += 1;
				
			} else if (escolhaDoCliente == 3) {
				diesel += 1; 

			}
			
			escolhaDoCliente = scanner.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scanner.close();

	}

}
