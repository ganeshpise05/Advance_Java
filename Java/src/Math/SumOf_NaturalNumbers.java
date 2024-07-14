package Math;

import java.util.Scanner;

// Sum of Natural Numbers:  S = n(n+1) / 2    n:Number of natural numbers.
 
public class SumOf_NaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of natural number you want to add: ");
		int n  = sc.nextInt();
		
		int sum = n * (n+1) / 2;
		System.out.println("The sum of the First "+n+" Natural number is: "+sum);
	}
}
