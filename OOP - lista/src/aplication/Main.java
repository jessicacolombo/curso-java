package aplication;

import entities.Employee;

import java.util.Scanner; 
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = scanner.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i + ":");
			
			System.out.print("Id: "); 
			int id = scanner.nextInt();
			while (isValid(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = scanner.nextInt();
			}
	
			System.out.print("Name: "); 
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have his salary increased: ");
		int idToIncrease = scanner.nextInt();
		Employee employee = list.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);
		if (employee == null ) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter de percentage: ");
			double percentage = scanner.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		
		
		System.out.println();
		System.out.print("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);		
		}
		
		scanner.close();
	}
	
	public static boolean isValid (List<Employee> list, int id) {
		Employee check = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return check != null;
	}
}
