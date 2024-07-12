package Statements;

import java.util.Scanner;

// Example 3: Checking for Even or Odd Number
public class Even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println("The given number  "+num+" is even.");
		} else {
           System.out.println("The number "+num+" is odd.");
		}
	}
}
