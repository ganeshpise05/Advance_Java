package decision_Statement;
import java.util.Scanner;

public class Elseif_Season {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a temperature : ");
		int month = sc.nextInt();
		
		if (month==12 || month==1 || month==2) {
			System.out.println("Winter season ");
		} 
		else if (month>=3 && month<=5) {
			System.out.println("Spring");
		}
		else if (month>=6 && month<=8) {
			System.out.println("Rainy Season");
		}
		else if (month>=9 && month<=12) {
			System.out.println("Autumn");
		}
		else {
             System.out.println("Please enter a valid year!!!!!");
		}
	}

}
