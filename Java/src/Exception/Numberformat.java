package Exception;

import java.util.Scanner;

//Example 3: Handling NumberFormatException

public class Numberformat {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	     //System.out.println("Please enter an integer1:");
		
		try {
			System.out.println("Please enter an integer1:");
			 int num1 = scanner.nextInt(); 
			 System.out.println("Please enter an integer2:");
			 int num2 = scanner.nextInt();
	         System.out.println("The entered integer is: " + num1 + " and "+num2);
		} 
		
		catch (NumberFormatException ne) {
			 System.out.println("Please enter a only integer and double values only.");
		}
	}

}
