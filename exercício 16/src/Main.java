import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int counterIn = 0;
		int counterOut = 0; 
		
		for (int i = 0; i < N; i++) {
			int X = scanner.nextInt();
			
			if (X >= 10 && X <= 20) {
				counterIn++;
			} else {
				counterOut++;
			}
		}
		
		scanner.close();
		
		System.out.println(counterIn + " in"); 
		System.out.println(counterOut + " out");
	}

}
