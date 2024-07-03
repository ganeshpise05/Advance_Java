package Arrays;

import java.util.Arrays;

// Right Rotate : Clockwise rotated array means right rotate ,We can shift elements right side. [1,2,3,4,5] ----> [5,1,2,3,4]

public class Clockwise_RightRotate_Array {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		int last = a[a.length-1];
		
		for (int i = a.length-1 ; i > 0 ; i--) {
			a[i] = a[i-1];
		}
		
		a[0] = last;
		System.out.println("The Right rotated array is: "+Arrays.toString(a));
	}
}
