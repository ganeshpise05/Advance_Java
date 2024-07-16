package Arrays;

import java.util.Arrays;
import java.util.Iterator;

// Remove Odd Index Elements : Give an one array and remove the odd index elements.
// [1,2,3,4,5,6,7,8,9] -------> [1,3,5,7,9]

public class PRemoveElementOddindex {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8};
		int ans[] = new int [a.length/2];
		
		 for (int i = 0, j = 0; i < a.length; i++) {
			if (i%2 == 0 ) {
				ans[j] = a[i];
				j++;
			}
		}
		 System.out.println(Arrays.toString(ans));
	}
}
