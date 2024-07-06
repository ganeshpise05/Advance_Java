package Arrays;

import java.util.Arrays;
import java.util.Iterator;

// Insert new Array: Give an a one array and insert new array from index 4 and print.
// [22,23,24,25,26,27,28,29,30]  + [01,02,03,04,05] insert from index 4  -----> [22,23,24,25,--01,02,03,04,05--,26,27,28,29,30]

public class InsertNewArray_InBetween {

	public static void main(String[] args) {
		
		int a [] = {22,23,24,25,26,27,28,29,30};
		int b [] = {01,02,03,04,05};
		int ans [] = new int [a.length+b.length];
		
		int index = 4;
		
		for (int i = 0 , j = 0; i < ans.length; i++) {
			
			if (i < index) {
				ans[i] = a[i];
			}
			 
			else if ( i >= index && j<b.length) {
				ans[i] = b[j];
				j++;
			} 
			
			else {
                ans[i] = a[i-b.length];
			}
		}
		
		System.out.println("The merged array from index 4 is: "+Arrays.toString(ans));
	}
}
