package Arrays;

import java.util.Arrays;

// Bubble Sort: Give an array and sort into the ascending order by using bubble sort.
// [9,8,3,4,2,6,7,1,5]  -----> [1,2,3,4,5,6,7,8,9]

public class Sort_Bubble {

	public static void main(String[] args) {
		
		int a [] = {9,8,3,4,2,6,7,1,5};
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-1-i; j++) {
			
				if (a[j]>a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			//System.out.println("Bubble sorted array is: "+Arrays.toString(a));
		}
		System.out.println("Bubble sorted array is: "+Arrays.toString(a));
	}
}
