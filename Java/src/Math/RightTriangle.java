package Math;

import java.util.Scanner;

// Find the angle <ABC (in degree) of right angle triangle where AB=5cm and AC=13cm.

public class RightTriangle {

	public static double findSinAngle(double oppoSide,double hypo)
	{
		double sinValue = (oppoSide/hypo);
		double theetaInRadian = Math.asin(sinValue);
		return Math.toDegrees(theetaInRadian);
	}
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.print("Enter Opposite Side Value: ");
		double oppoSide = sc.nextDouble();
		
		System.out.print("Enter Hypotanious: ");
		double hypo = sc.nextDouble();
		
		System.out.println("Angle in Degree: "+findSinAngle(oppoSide,hypo));
	}
}
