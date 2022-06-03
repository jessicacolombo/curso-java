package aplication;

import java.util.Scanner; 
import java.util.Locale; 
import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Name of the student: ");
		student.name = scanner.nextLine();
		System.out.println("First grade: "); 
		student.grade1 = scanner.nextDouble();
		System.out.println("Second grade: ");
		student.grade2 = scanner.nextDouble();
		System.out.println("Third grade: ");
		student.grade3 = scanner.nextDouble();
		
		System.out.printf("Final grade: %.2f %n", student.finalGrade());
		System.out.println(student.wasAproved());
		
		if (student.finalGrade() < 60) {
			System.out.printf("Missing points: %.2f", student.missingPoints());
		} else {
			System.out.println();
		}
		
		scanner.close();
	}

}
