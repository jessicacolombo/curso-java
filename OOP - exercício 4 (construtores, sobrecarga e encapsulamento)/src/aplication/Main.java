package aplication;

import java.util.Scanner;
import java.util.Locale;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char confirmation = scanner.next().charAt(0);
		
		double firstDeposit;
			
			if (confirmation == 'y') {
				
				System.out.println("Enter initial deposit value: ");
				firstDeposit = scanner.nextDouble();
				account = new Account(accountNumber, holder, firstDeposit);
			
			} else {
				
				account = new Account(accountNumber, holder);
			
			}
		
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println("");
		
		System.out.println("Enter a deposit value: ");
		double deposit = scanner.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println("");
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = scanner.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		scanner.close();

	}

}
