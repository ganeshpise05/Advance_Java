package Math;

import java.util.Scanner;

// Formula 1: (a+b)^2 = a^2 + 2ab + b^2
// Formula 2: (a-b)^2 = a^2 - 2ab + b^2
// Formula 3: (a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3
// Formula 4: (a-b)^3 = a^3 - 3a^2b  + 3ab^2 - b^3

public class Binomial_Expansion {

	public static double formulaOne(double a,double b)
	{
		double formulaValue = Math.pow(a, 2) + (2*a*b) + Math.pow(b, 2);
		return formulaValue;
	}
	
	public static double formulaTwo(double a,double b)
	{
		double formula2Value = Math.pow(a, 2) - (2*a*b) + Math.pow(b, 2);
		return formula2Value;
	}
	
	public static double formulaThree(double a,double b)
	{
		double formula3Value = Math.pow(a, 3) + (3*Math.pow(a, 2)*b) + (3*a*Math.pow(b, 2)) + Math.pow(b, 3);
		return formula3Value;
	}
	
	public static double formulaFour(double a,double b)
	{
		double formula4Value = Math.pow(a, 3) - (3*Math.pow(a, 2)*b) + (3*a*Math.pow(b, 2)) - Math.pow(b, 3);
		return formula4Value;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter value of a: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter value of b: ");
		double b = sc.nextDouble();
		
		System.out.println("Formula one output: "+formulaOne(a,b));
		System.out.println("Formula two output: "+formulaTwo(a,b));
		System.out.println("Formula three output: "+formulaThree(a,b));
		System.out.println("Formula four output: "+formulaFour(a,b));
	}
}
