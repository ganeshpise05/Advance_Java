package Arrays;

import java.util.Arrays;

// Remove Odd Elements: Give an one array and remove the all odd elements.
// [1,2,3,4,5,6,7,8,9,10]  ------>  [2,4,6,8,10]

public class Remove_OddElements {

	public static void main(String[] args) {
		
		int a [] = {1,3,5,6,7,8,9,10};
	    
		// First count the number of even elements
        int evenCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            }
        }
        
        int ans [] = new int [evenCount];
		for (int i = 0,j = 0; i < a.length; i++) {
			
			if (a[i] % 2 ==0) {
				ans[j]=a[i];
				j++; 
			}
		}
		System.out.println("The odd elements removed array is: "+Arrays.toString(ans));
	}
}
