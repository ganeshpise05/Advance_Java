package Statements;

import java.util.Scanner;

// Example 4: Checking for Pass or Fail
public class Pass {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int marks = sc.nextInt();
		
		if (marks>35) {
			System.out.println("You are pass the exam.");
		} else {
           System.out.println("You are failed in exam.");
		}
	}
}
