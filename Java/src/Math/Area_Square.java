package Math;

import java.util.Scanner;

// Area Of Square: A = (Side)^2

public class Area_Square {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the side: ");
		double side = sc.nextDouble();
		
		double area = Math.pow(side, 2);
		System.out.println("The area of Square: "+area);
	}
}
