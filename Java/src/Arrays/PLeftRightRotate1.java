package Arrays;

import java.util.Arrays;

// Even size Left and Right rotate. [1,2,3,4,5,6,7,8] ---------->  [2,3,4,1,8,5,6,7]
public class PLeftRightRotate1 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8};
		
		// First half left shift / Anti-clockwise rotate.
		int first = a[0];
		for (int i = 0; i < a.length/2-1; i++) {
			 a[i] = a[i+1];
		}
		a[a.length/2-1] = first;
		
		// Second half right shift / Clockwise rotate.
		int last = a[a.length-1];
		for (int i = a.length-1; i > a.length/2; i--) {
			a[i] = a[i-1];
		}
		a[a.length/2] = last;
		System.out.println(Arrays.toString(a));
	}
}
