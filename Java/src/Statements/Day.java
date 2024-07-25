package Statements;

import java.util.Scanner;

// Example 1: Day of the Week
public class Day {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a day: ");
		int day = sc.nextInt();
		
		String dayName = null;
		
		switch (day) {
		    case 1:
			  dayName = "Monday";
			  break;
			  
		    case 2:
		    	dayName = "Tuesday";
		    	break;
		    	
		    case 3:
		    	dayName = "Wednesday";
		    	break;
		    	
		    case 4:
		    	dayName = "Thursday";
		    	break;
		    	
		    case 5:
		    	dayName = "Friday";
		    	break;
		    	
		    case 6:
		    	dayName = "Saturday";
		    	break;
		    	
		    case 7:
		    	dayName = "Sunday";
		    	break;

		default:
			System.out.println("Please enter a valid Day.");
			break;
		}
		  System.out.println(dayName);
	}
}
