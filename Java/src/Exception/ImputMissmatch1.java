package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Input missmatch exception.

public class ImputMissmatch1 {
	
	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter an integer:");

	        try {
	        	
	            int num = scanner.nextInt(); // This may cause InputMismatchException
	            System.out.println("The entered integer is: " + num);
	        } 
	        
	        catch (InputMismatchException e) {
	            System.out.println("InputMismatchException caught: Invalid input type.");
	            System.out.println("Exception message: " + e.getMessage());
	        }
	}

}
