package Statements;

import java.util.Scanner;
import java.util.regex.MatchResult;

//Example 2: Grade Evaluation
public class Grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a grade: ");
		char grade = sc.next().charAt(0);
		
		String result = null;
		
		switch (grade) {
		case 'A':
			result = "Excellent";
			break;

		case 'B':
			result = "Good";
			break;
			
		case 'C':
			result = "Average";
			break;
			
		case 'D':
			result = "Poor";
			break;
			
		case 'F':
			result = "Fail";
			break;
			
		default:
			System.out.println("Please enter valid grade.");
			break;
		}
		System.out.println("Your result is: "+result);
	}
}
