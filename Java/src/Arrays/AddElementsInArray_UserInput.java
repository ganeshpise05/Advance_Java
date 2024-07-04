package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Take inputs from user : Ask how many index want to add (no of index) and insert the element (no of  elements) 
public class AddElementsInArray_UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	 
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
 
		int[] a = new int[n];
		System.out.println("Enter the Elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));	
	}
}
