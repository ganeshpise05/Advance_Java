package Arrays;

import java.util.Arrays;

////Odd Size  : Mid element Don't include in First and Second half. [1,2,3,4,5,6,7,8,9] -----> [2,3,4,1,5,9,6,7,8]
public class PLeftRightRotate4 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9};
		
		//First half left shift.
		int first = a[0];
		for (int i = 0; i < a.length/2-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length/2-1] = first;
		
		//Second half right shift.
		int last = a[a.length-1];
		for (int i = a.length-1; i > a.length/2+1; i--) {
			a[i] = a[i-1];
		}
		a[a.length/2+1] = last;
		System.out.println(Arrays.toString(a));
	}
}
