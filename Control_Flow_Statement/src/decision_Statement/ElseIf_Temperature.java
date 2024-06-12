package decision_Statement;
import java.util.Scanner;

public class ElseIf_Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a temperature : ");
		int temp = sc.nextInt();
		
		if (temp<=0) {
			System.out.println("Temperature is at about Freezing point.");
		} 
		else if (temp<=10) {
			System.out.println("It is very cold.");
		}
		else if (temp<=20) {
			System.out.println("Temperature is cold.");
		}
		else if (temp<=30) {
			System.out.println("The room temp is Warm.");
		}
		else if (temp<=40) {
			System.out.println("The room temperature is very hot please turn on the AC..");
		}
		else {
             System.out.println("Please enter a valid temperature !!!!");
		}
	}

}
