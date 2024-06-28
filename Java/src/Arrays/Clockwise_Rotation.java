package Arrays;

import java.util.Arrays;

//8:Rotate the given array in clockwise direction/rotation [1,2,3,4,5] --->  [5,1,2,3,4]

public class Clockwise_Rotation {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		
		for (int j= 0; j < 1; j++) {
			
			int temp = a[a.length-1];
			
			for (int i = a.length-1; i > 0; i--) {
				
				a[i] = a[i-1];
			}
			
			a[0] = temp;
		}
		
		System.out.println("The clockwise rotated array is: "+ Arrays.toString(a));
	}
}
