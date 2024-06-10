package decision_Statement;
import java.util.Scanner;

//Example 8: Checking if a number is odd
public class IfElseEvenodd {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if (num%2==0) {
			
			System.out.println("The given number id even Number.");
			
		} else {
			
			System.out.println("The given number is Odd numbers");

		}

	}

}
