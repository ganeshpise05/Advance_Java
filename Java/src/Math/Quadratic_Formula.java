package Math;

import java.util.Scanner;

// ax^2+bx+c Find value of x
// x = -b + ((sqroot(b^2-4*a*c)))/2*a

public class Quadratic_Formula {

	public static double findValueX(double a,double b,double c)
	{
		double formula = -b +  ( Math.sqrt(Math.pow(b, 2) - 4*a*c) ) / 2*a;
		return formula;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter value of a: "); // 1 ,1 , 1
		double a = sc.nextDouble(); 
		
		System.out.print("Enter value of b: "); // 2 , -3 , 1
		double b = sc.nextDouble();
		
		System.out.print("Enter value of c: "); // 1 , 2 , 1
		double c = sc.nextDouble();
		
		System.out.println("The Solved quadratic equation value of X is: "+findValueX(a,b,c)); 
	}
}
