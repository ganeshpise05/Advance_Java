package Arrays;

import java.util.Arrays; 

// Making elements Odd: Give an a array if element is odd then print and if even make it odd.
//[22,3,4,5,6,7,8,91,23,44,55] ------> [22,4,4,6,6,8,8,92,24,44,56]
public class PrintOdd_ifEvenMake_Odd {
	
	public static void main(String[] args) {
		
		int a [] = {22,3,12,54,67,87,98,34,23,12};
		int ans [] = new int [a.length];
		
		for (int i = 0, j = 0; i < a.length; i++,j++) {
			
			if (a[i] % 2 != 0) {
				ans[j] = a[i];
			} 
			
			else {
                ans[j] = a[i]+1;
			}
		}
		
		System.out.println("Odd element array by converting even to Odd is: "+Arrays.toString(ans));
	}

}
