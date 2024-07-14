package decision_Statement;
import java.util.Scanner;
//Nested if-else Example No:2

public class ElseIf_AgeGroup {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a age : ");
		int age = sc.nextInt();
		
		if (age<13) {
			System.out.println("The person is Child.");
		} 
		else if (age<20) {
			System.out.println("This person is Teenager.");
		}
		else if ( age<65) {
			System.out.println("The given person is Adult");
		}
		else {
            System.out.println("Please enter a valid Age !!");
		}
	}

}
