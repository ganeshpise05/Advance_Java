package Statements;

import java.util.Scanner;

// Example 7: Checking for Leap Year
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The given year "+year+" is Leap Year.");
		} else {
            System.out.println("The given year is not Leap year.");
		}
	}
}
