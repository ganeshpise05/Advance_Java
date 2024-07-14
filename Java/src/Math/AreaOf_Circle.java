package Math;

import java.util.Scanner;

// Area of Circle: pi*r^2

public class AreaOf_Circle {

	public static void main(String[] args) {
		
		double pi = 3.14;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius of Circle: ");
		double r = sc.nextDouble();
		
		double areaOfCircle = pi*Math.pow(r, 2);
		System.out.println("Area of Circle is: "+areaOfCircle);
	}
}
