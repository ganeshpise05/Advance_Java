package decision_Statement;
import java.util.Scanner;

//Example 7: Checking if a temperature is below freezing point
public class IfElseTemperature {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a temperature : ");
		int temp = sc.nextInt();
		
		if (temp<0) {
			
			System.out.println("The temperature is below freezing point.");
			
		} else {

			System.out.println("The temperature is not below freezing point.");
		}
	}

}
