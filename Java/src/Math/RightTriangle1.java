package Math;

import java.util.Scanner;

// Find <Z (in degree) of a right angle triangle XYZ where XY=6cm & YZ=8cm
// Hypotanious is always greater than side (Hypo > side).

public class RightTriangle1 {

	public static double findCosAngle(double adjSide,double hypo)
	{
		double cosValue = (adjSide/hypo);
		double theetaInRadian = Math.acos(cosValue);
		return Math.toDegrees(theetaInRadian);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Adjucent Side: ");
		double adjSide = sc.nextDouble(); // 6
		
		System.out.print("Enter Hypotanious: ");
		double hypo = sc.nextDouble(); // 8
		
		System.out.println("The <Z in Degrees is: "+findCosAngle(adjSide,hypo));
 
	}
}
