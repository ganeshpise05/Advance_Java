package Math;

import java.util.Scanner;

public class Floor_Ceil_Round {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		// Floor Method: This method can convert the double value into lowest integer value.
		System.out.print("Enter double value which want to convert using Floor Method: ");
		double floor = sc.nextDouble(); //12.4 , 12.6
		System.out.println("The converted value using Floor is: "+Math.floor(floor)); //12.0  , 12.0
		
		System.out.println(" ");
		
		// Ceil Method: This method can convert the double value into highest integer value.
		System.out.print("Enter double value which want to convert using Ceil Method: ");
		double ceil = sc.nextDouble(); //44.1 , 44.7
		System.out.println("The converted value using Ceil is: "+Math.ceil(ceil)); //45.0 , 45.0
		
		System.out.println(" ");
		
		// Round Method: This method can convert the double value into nearest integer value(increase or decrease).
		System.out.print("Enter double value which want to convert using Round Method: ");
		double round = sc.nextDouble(); // 12.4 , 12.5 , 12.9
		System.out.println("The converted value using Round is: "+Math.round(round)); // 12 , 13 , 13
	}
}
