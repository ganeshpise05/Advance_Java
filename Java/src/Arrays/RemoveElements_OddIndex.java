package Arrays;

import java.util.Arrays;

// Remove Elements: Give one array and remove the odd index elements in array.
// [1,2,3,4,5,6,7,8,9] -----> [2,4,6,8]
public class RemoveElements_OddIndex {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,83,9,10,11,12,13,17,41,53,1};
		// Giving size for new array 
		int ans[] = new int[a.length/2];
		 
		for (int i = 0,j = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				ans[j] = a[i];
				j++;
			}  
		}
		System.out.println("Odd index elements removed array is: "+Arrays.toString(ans));
	}
}
