package Math;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// Min Method : Find the minimum value using Min method.
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt(); // 4 , -2
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt(); // 5 , -4
		
		System.out.println("The minimum value in "+num1+" and "+num2+" is: "+Math.min(num1, num2)); // 4 , -4
		
		System.out.println(" "); 
		
		// Max Method: Find the maximum value using Max method.
		System.out.print("Enter the first num: ");
		double n1 = sc.nextDouble(); //12.4 , -33.2
		 
		System.out.print("Enter the second num: ");
		double n2 = sc.nextDouble(); //12.1 , -33.9
		
		System.out.println("The Maximum value in "+n1+" and "+n2+" is: "+Math.max(n1, n2)); //12.4 , -33.2
	}
}
