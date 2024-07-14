package Math;

import java.util.Scanner;

// Triangle (for a right-angled triangle): A = 1/2 * base * height

public class Area_RightTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter base: ");
		double base = sc.nextDouble();
		
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		
		double area = 0.5 * base * height;
		System.out.println("Area of the triangle = " + area);
	}
}
