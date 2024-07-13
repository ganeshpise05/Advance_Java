package Math;

import java.util.Scanner;

// Find <A (in degree) of a Right angle triangle ABC where AB=3cm & AC=5cm.
// Hypotanious is always greater than side (Hypo > side).

public class RightTriangle2 {

	public static double findTanAngle(double oppoSide,double hypo)
	{
		double tanValue = (oppoSide/hypo);
		double theetaInRadian = Math.tan(tanValue);
		return Math.toDegrees(theetaInRadian);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Opposite side: ");
		double oppoSide = sc.nextDouble(); // 3
		
		System.out.print("Enter Adjucent side: ");
		double adjSide = sc.nextDouble(); // 5

		System.out.println("The right angle Triangle <A in degree value is: "+findTanAngle(oppoSide,adjSide));
	}
}
