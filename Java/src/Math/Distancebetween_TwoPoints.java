package Math;

import java.util.Scanner;

// Distance Between Two Points: d = sqr((X2-X1)^2 + (Y2-Y1)^2)

public class Distancebetween_TwoPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("X2 : ");
		double x2 = sc.nextDouble();
		
		System.out.print("Y2 : ");
		double y2 = sc.nextDouble();
		
		System.out.print("X1 : ");
		double x1 = sc.nextDouble();
		
		System.out.print("Y1 : ");
		double y1 = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2)) ;
		System.out.println("Distance between two points is: "+distance);
	}
}
