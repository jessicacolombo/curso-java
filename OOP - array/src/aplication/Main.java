package aplication;

import java.util.Scanner;
import entities.Rent;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Rent[] array = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int rentedRooms = scanner.nextInt();
		
		for (int i = 1; i <= rentedRooms; i++) {
	
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Email: ");
			String email = scanner.nextLine();
			
			System.out.print("Room: ");
			int room = scanner.nextInt();
			
			array[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i=0; i<10; i++) {
			if (array[i] != null) {
				System.out.println(i + ": " + array[i]);
			}
		}
		
		scanner.close();

	}

}
