package Arrays;

import java.util.Arrays;

// Left and Right Rotate (Even Array size): Give one array rotate the first half in left-shift(Anti-clockwise) and Second half in Right-shift(Clockwise rotate)
// [1,2,3,4,5,6,7,8] ----> [2,3,4,1,8,5,6,7]

public class LeftAndRight_Rotate {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8};
		int first = a[0];
		for (int i = 0; i < a.length/2-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length/2-1] = first;
		
		int last = a[a.length-1];
		for (int i = a.length-1; i > a.length/2; i--) {
			a[i] = a[i-1];
		}
		a[a.length/2] = last;
		
		System.out.println("The leftside LeftRotate and rightside RightRotated array is: "+Arrays.toString(a));
	}
}
