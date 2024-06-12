package decision_Statement;
import java.util.Scanner;

public class Elseif_PerformanceEvalution {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a Performance of a Employee : ");
		int performance = sc.nextInt();
		
		if (performance>=90 && performance<=100) {
			System.out.println("Outstanding");
		}
		else if (performance>=75) {
			System.out.println("Exceeds Expectation");
		}
		else if (performance>=60) {
			System.out.println("Meets Expectation");
		}
		else if (performance>=50) {
			System.out.println("Needs Improvement !");
		}
		else {
			System.out.println("Your performance was unsatisfactory ..");
		}
		

	}

}
