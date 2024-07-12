package Statements;

import java.util.Scanner;

// Example 6: Checking for Null or Empty String
public class StringNull {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		
		if (str == null || str.isEmpty()) {
			System.out.println("The given string is empty.");
		} else {
            System.out.println("The given string is not empty which contain : "+str);
		}
	}
}
