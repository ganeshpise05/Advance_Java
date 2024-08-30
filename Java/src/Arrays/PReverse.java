package Arrays;

import java.util.Arrays;

// Reverse Array: [1,2,3,4,5,6,7,8,9] ------> [9,8,7,6,5,4,3,2,1]

public class PReverse {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9}; 
		
		for (int i = 0, j = a.length-1; i < j; i++,j--) {
			int temp = a[i];
			a[i] = a[j];
			 a[j] = temp;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
