package Arrays;

import java.util.Arrays; 

// Give one array having even elements in this array First half must be same but Second half must be reversed.[1,2,3,4,5,6,7,8,9,10]  -----> [1,2,3,4,5,10,9,8,7,6]

public class Firstasitis_SecondHalf_Reverse {

	public static void main(String[] args) {
		 
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = a.length/2, j = a.length-1; i < j ; i++,j--) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println("The second half reversed array is: "+Arrays.toString(a));
	}

}
