package decision_Statement;
import java.util.Scanner;

public class Elseif_Signals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Light/Signal color : ");
		String color = sc.nextLine();
		
		if (color=="Red") {
			System.out.println("Stop the vehicles.");
		} 
		else if (color=="Green") {
			System.out.println("Now you can go now.");
		}
		else if (color=="yellow") {
			System.out.println("Caution Please decrease the speed of Vehicles !!!!!!");
		}
		else {
           System.out.println("Please enter a valid color !!!!!!!");
		}

	}

}
