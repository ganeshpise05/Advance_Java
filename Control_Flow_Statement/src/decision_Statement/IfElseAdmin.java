package decision_Statement;
import java.util.Scanner;

//Example 9: Checking if a user is an admin
public class IfElseAdmin {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a role of user : ");
		String role = sc.next();
		
		if (role=="admin") {
			
			System.out.println("The given person is admin.");
			
		} else {
			
			System.out.println("The given person is not admin.");

		}

	}

}
