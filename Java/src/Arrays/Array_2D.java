package Arrays;

import java.util.Scanner;

// 2D Array: Give input from user and create an a array.

public class Array_2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an elements: ");
		
		int a [] [] = new int [3][3];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[0].length; j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
