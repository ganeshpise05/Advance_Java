package Arrays;

import java.util.Arrays;

//8:Rotate the given array in Anti-clockwise direction/rotation [1,2,3,4,5] --->  [2,3,4,5,1]
public class Anticlockwise_Rotation {

	public static void main(String[] args) {
		
         int [] a = {1,2,3,4,5};
		
		for (int j= 0; j < 4; j++) {
			
			int temp = a[a.length-1];
			
			for (int i = a.length-1; i > 0; i--) {
				
				a[i] = a[i-1];
			}
			
			a[0] = temp;
		}
		
		System.out.println("The Anti-clockwise rotated array is: "+ Arrays.toString(a));
	}
}
