package Arrays;

import java.util.Arrays; 

//  Odd Size array Second Half reverse (Middle element in remains same position)
public class SecondHalf_Reverse_OddSizeArray3 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,24,55,6,7,8,9,10,11};
		
		for (int i = a.length/2+1, j=a.length-1; i <= j; i++,j--) {
			
			int temp = a[i];
			 a[i] = a[j];
			 a[j] = temp;
		}
		
		System.out.println("The second half reversed and middle element is in remains same position is: "+Arrays.toString(a));
	}
}
