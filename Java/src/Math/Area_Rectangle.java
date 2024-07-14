package Math;

import java.util.Scanner;

// Area Of Rectangle: A = length * width

public class Area_Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Lenght: ");
		double length = sc.nextDouble();
		
		System.out.print("Width: ");
		double width = sc.nextDouble();
		
		double area = length * width;
		System.out.println("Area of rectangle = "+area);
	}
}
