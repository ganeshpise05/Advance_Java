package Math;

import java.util.Scanner;

//Sum of Arithmetic Series: Sn = n/2(a+l)  n:Number of terms , a:First term , l:last term

public class sumOf_ArithmaticSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number of Terms n: ");
		int n = sc.nextInt();
		
		System.out.print("Enter first term: ");
		int a = sc.nextInt();
		
		System.out.print("Enter last term: ");
		int l = sc.nextInt();
		
		int sum = (n/2) * (a + l);
		System.out.println("The sum of Arithmetic Series is: "+sum);

	}
}
