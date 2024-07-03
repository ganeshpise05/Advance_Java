package Arrays;

import java.util.Arrays;

// LeftRotate Array: The given array elements are shifted to the left side of array. [1,2,3,4,5] ----> [2,3,4,5,1]

public class Anticlockwise_LeftRotate_Array {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		int first = a[0];
		
		for (int i = 0; i < a.length-1;i++)
		{
			a[i] = a[i+1];
		}
		
		 a[a.length-1] = first;
		 System.out.println("The LeftRotated array is: "+Arrays.toString(a));
	}
}
