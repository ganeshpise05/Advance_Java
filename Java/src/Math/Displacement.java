package Math;

import java.util.Scanner;

// Find Displacement : formula = Vo*t + 1/2 at^2

// Vo = Initial velocity of object (m/s)
// t = Time taken by object to travel distance
// a = acceleration (m/s)^2

public class Displacement {

	public static double displacement(double velocity,double time,double acceleration)
	{
		double displacement = (velocity*time) + (0.5*acceleration*(Math.pow(time, 2)));
		return displacement;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Velocity: ");
		double velocity = sc.nextDouble();
		
		System.out.print("Enter Time: ");
		double time = sc.nextDouble();
		
		System.out.print("Enter Acceleration: ");
		double acce = sc.nextDouble();
		
		System.out.println("The Displacement of Object is : "+displacement(velocity,time,acce));
	}
}
