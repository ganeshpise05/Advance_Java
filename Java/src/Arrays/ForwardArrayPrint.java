package Arrays;

import java.util.Arrays;

// Print the elements of array in forward . [1,2,3,5] -----> 1,2,3,4,5
public class ForwardArrayPrint {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]+" ");
			
		}
		System.out.println("In array Format: "+Arrays.toString(a));
	}
}
