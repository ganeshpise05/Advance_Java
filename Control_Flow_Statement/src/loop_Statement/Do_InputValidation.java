package loop_Statement;

import java.util.Scanner;

public class Do_InputValidation {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age;
		
		do {
		    System.out.println("Enter your age:");
		    age = scanner.nextInt();
		}
		
		while (age <= 0 || age >= 120); // Assume valid age range
		System.out.println("Your age is: " + age);
		
		scanner.close();
	}

}
