package decision_Statement;
import java.util.Scanner;

public class Elseif_ExamResult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a marks : ");
		int marks = sc.nextInt();
		
		if (marks>=90) {
			System.out.println("Very Excellent marks obtained.");
		} 
		else if (marks>=80) {
			System.out.println("you got very good marks.");
		}
		else if (marks>=50) {
			System.out.println("Obtained Good marks.");
		}
		else if (marks>=35) {
			System.out.println("You have to just passed the exam....");
		}
		else {
           System.out.println("you are fail in the exam ...Better luck do study next time ");
		}

	}

}
