package Arrays;

import java.util.Arrays;

// Remove Elements: Give one array and remove the odd index elements in array.
// [1,2,3,4,5,6,7,8,9] -----> [2,4,6,8]
public class RemoveElements_OddIndex {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9};
		// Giving size for new array
		int newSize = (a.length + 1) / 2;
		int ans[] = new int[newSize];
		 
		for (int i = 0,j = 0; i < a.length; i++) {
			if (i%2 == 0) {
				ans[j] = a[i];
				j++;
			}  
		}
		System.out.println(Arrays.toString(ans));
	}
}
