package loop_Statement;

//Calculating factorial of a number:

public class Whilt_Factorial {
	
	public static void main(String[] args) {
		
		int number = 5;
		int factorial = 1;
		int i = 1;
		{
		while (i <= number) {
		    factorial *= i;
		    i++;
		}
		System.out.println("Factorial of " + number + " is " + factorial);
		}
	}

}
