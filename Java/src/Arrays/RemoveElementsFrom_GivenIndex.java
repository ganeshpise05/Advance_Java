package Arrays;

import java.util.Arrays;
import java.util.Iterator;

// Remove Elements : Give an one array and remove the elements from index 3 to index 6.(It not consider 6th index element)
// [1,2,3,4,5,6,7,8,9]  ---------->  [1,2,3,7,8,9]

public class RemoveElementsFrom_GivenIndex {

	public static void main(String[] args) {
		
		int start = 3;
		int end = 6;
		int diff = end - start; 
		
		int a [] = {1,2,3,4,5,6,7,8,9};
		int ans [] = new int [a.length-diff];
		
		for (int i = 0; i < ans.length; i++) {
			if (i<start) {
				ans[i] = a[i];
			}
			else {
                ans[i] = a[i+diff];
			}
		
		}
		System.out.println(Arrays.toString(ans));
	}
}
