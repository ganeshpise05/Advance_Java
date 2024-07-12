package Statements;

import java.util.Scanner;

// Example 5: Checking Temperature
public class Temperature {

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a temperature: ");
		 int temp = sc.nextInt();
		 
		 if (temp>25) {
			System.out.println("Today temperature is hot.");
		} else {
           System.out.println("Today temp is Cool.");
		}
	}
}
