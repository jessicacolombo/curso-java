package aplication;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter M: ");
		int m = scanner.nextInt();
		System.out.print("Enter N: ");
		int n = scanner.nextInt();
		
		int[][] matrix = new int [m][n];
		
		System.out.println("Enter matrix numbers: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);
					
					if (j > 0) {
					System.out.println("Left:" + matrix[i][j - 1]);
					
					}
					
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
						
					}
					
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
						
					}
					
					
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
						
					}
				
				}
			
			}
		
		}
		
		scanner.close();

	}

}
