package Inheritance;
 
import java.util.InputMismatchException;
import java.util.Scanner;
 

public class Throwable_exe {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Entr a num1: ");
			int num1 = sc.nextInt();
			
			
			System.out.println("Enter a num2: ");
			int num2 = sc.nextInt();
			
			System.out.println("The addition of num1 and num2 is: "+num1+num2);
			
		} 
		
		catch (InputMismatchException ne) {
			 
			System.out.println("In above example input missmatch was occured.");
		}
		
		catch (Exception e) {
			 System.out.println("From exception class block.");
		}
		
		//Below block shows about the Throwable type exception.It is parent of Exception class
		
	   catch (Throwable te) {
		 System.out.println("From the Throable Exception block.");
	}
		
	}

}
