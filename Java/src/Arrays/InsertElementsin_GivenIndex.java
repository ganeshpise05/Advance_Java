package Arrays;

import java.util.Arrays;

// Insert Elements: Give one array and insert elements from index 3 .
// [1,2,3,4,5,6,7,8,9] insert elements 40,41,42,43 -----> [1,2,3,40,41,42,43,4,5,6,7,8,9]

public class InsertElementsin_GivenIndex {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9};
		int b [] = {40,41,42,43};
		
		int ans [] = new int [a.length+b.length];
		int index = 3;
		
		for (int i = 0, j = 0; i < ans.length; i++) {
			
			if (i<index) {
				ans[i] = a[i];
			}
			
			else if (i>=index && j<b.length) {
				ans[i] = b[j];
				j++;
			}
			
			else {
                ans[i] = a[i];
			}
		}
		
		System.out.println("The inserted elements from index 3 is: "+Arrays.toString(ans));
	}
}
