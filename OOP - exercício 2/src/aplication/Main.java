package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Name of the employee: ");
		employee.name = scanner.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = scanner.nextDouble();
		System.out.println("Taxes: ");
		employee.tax = scanner.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee); 
		System.out.println("Which percentage to increase salary? ");
		double increase = scanner.nextDouble();
		employee.increaseSalary(increase);
		System.out.println("Update data: " + employee);
		
		scanner.close();
		
	}

}
