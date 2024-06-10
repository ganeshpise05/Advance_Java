package decision_Statement;
import java.util.Scanner;

//Example 5: Checking if a person is a teenager
public class IfElseTeenager {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a age :");
		int age = sc.nextInt();
		
		if (age>=13 && age<=18) {
			
			System.out.println("The given person is teenager.");
			
		} else {
			
			System.out.println("The given person is not teenager.");

		}
	}

}
