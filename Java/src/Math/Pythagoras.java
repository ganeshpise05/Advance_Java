package Math;

import java.util.Scanner;

// Pythagorean Theorem: hypo^2 = base^2 + height^2

public class Pythagoras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter value of base: ");
		double base = sc.nextDouble();
		
		System.out.print("Enter value of height: ");
		double height = sc.nextDouble();
		
		double hypo  =  Math.sqrt(base*base + height*height) ;
		System.out.println("The value of hypotanious is: "+hypo);
	}
}
