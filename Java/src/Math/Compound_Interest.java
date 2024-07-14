package Math;

import java.util.Scanner;

// Compound Interest: A = P(1+r/n)^nt  P:Principal,r:rate,n:timesCompunded,t:time/years

public class Compound_Interest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter principal p: ");
		double p = sc.nextDouble();
		
		System.out.print("Enter rate r: ");
		double r = sc.nextDouble();
		
		System.out.print("Enter compound time n: ");
		double n = sc.nextDouble();
		
		System.out.print("Enter time in years t: ");
		double t = sc.nextDouble();
		
		double amount = p * Math.pow((1+r/n), n * t);
		System.out.println("The compound interest is: "+amount);
	}
}
