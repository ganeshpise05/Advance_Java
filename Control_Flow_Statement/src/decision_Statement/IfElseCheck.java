package decision_Statement;
import java.util.Scanner;

//Example 6: Checking if a string contains a specific character
public class IfElseCheck {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		String str = sc.next();
		
		if  (str.contains("e")) {
			
			System.out.println("The string contains the character 's'.");
			
		} else {
			
			System.out.println("The string does not contains the character 's'.");

		}
	}

}
