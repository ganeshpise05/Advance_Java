package decision_Statement;
import java.util.Scanner;

//Example 10: Checking if a string is empty
public class IfElseStringEmpty {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		 String str = sc.next();

		 if (str.isEmpty()) {
			 
			 System.out.println("The given string is empty.");
			
		} else {
			
			System.out.println("The given string is not empty which contain following string :" + str);

		}
	}

}
