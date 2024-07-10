package Arrays;

import java.util.Arrays;

// Bubble Sort: Give one array and sort elements by using the asc order.
// [9,8,7,6,5,4,3,2,1] -----> [1,2,3,4,5,6,7,8,9]

public class Bubble_sort {

	public static void main(String[] args) {
		
		int a [] = {9,8,7,6,5,4,3,2,1};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					   a[j] = a[j+1];
					   a[j+1] = temp;
				}
			}
		}
		System.out.println("Bubble Sorted Array: "+Arrays.toString(a));
	}
}
