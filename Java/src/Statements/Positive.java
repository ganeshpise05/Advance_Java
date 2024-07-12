package Statements;

import java.util.Scanner;

//Example 2: Checking Number Positivity.
public class Positive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("The given number "+num+" is positive.");
		} else {
            System.out.println("The given number "+num+" is negative.");
		}
	}
}
