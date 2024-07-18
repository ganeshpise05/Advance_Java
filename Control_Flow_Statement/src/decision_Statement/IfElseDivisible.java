package decision_Statement;
import java.util.Scanner;

//Example 4: Checking if a number is divisible by 5
public class IfElseDivisible {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		if (num%5==0) {
			
			System.out.println("The given number is divisible by 5.");
			
		} else {
			
			System.out.println("The given number is not divisible by 5.");

		}

	}

}
