package loop_Statement;

import java.util.Scanner;

//Reading input until a certain condition is met:

public class While_SearchingInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		while (true) {
		    System.out.println("Enter 'exit' to quit:");
		    input = sc.nextLine();
		    
		    if (input.equals("exit"))
		    {
		        break;
		    }
		}
	}
}
