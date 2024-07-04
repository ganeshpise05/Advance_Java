package Arrays;

import java.util.Arrays; 

// Give an a array if element is even then print and if odd make it even.
// [22,3,4,5,6,7,8,91,23,44,55] ------> [22,4,4,6,6,8,8,92,24,44,56]

public class PrintEven_ifOddMake_Even {

	public static void main(String[] args) {
		
		int a [] = {22,38,4,35,6,77,8,3,9};
		int ans [] = new int [a.length];
		for (int i = 0,j=0; i < a.length; i++,j++) {
			
			if (a[i]%2==0) {
				ans[j] = a[i];
				
			} else {
                ans[j] = a[i]+1;
			}	
		}
		System.out.println(Arrays.toString(ans));
	}
}
