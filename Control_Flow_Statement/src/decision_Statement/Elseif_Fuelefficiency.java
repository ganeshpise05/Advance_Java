package decision_Statement;
import java.util.Scanner;

public class Elseif_Fuelefficiency {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Milage of Bike : ");
		double milage = sc.nextDouble();
		
		if (milage>=25 && milage<35) {
			System.out.println("Our bike milage is Average");
		} 
		else if (milage>=35 && milage<50) {
			System.out.println("Milage was Good!");
		}
		else if (milage>=50 && milage<95) {
			System.out.println("Our bike milage was very Excellent!!!!!!");
		}
		else {
              System.out.println("This is not affortable bike sold in road !!!!!!!");
		}

	}

}
