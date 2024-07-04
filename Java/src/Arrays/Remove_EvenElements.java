package Arrays;

import java.util.Arrays;

// Remove even Element: Give one array prints odd element and remove even elements.
// [2,66,4,2,13,7,6,55,9,16,35]  -------> [13,7,55,9,35]
public class Remove_EvenElements {

	public static void main(String[] args) {
		
		int a [] = {2,3,4,5,7,9,2,1,9,1,7};
		
		// First count the odd elements.
		int oddCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				oddCount++;
			}
		}
		
		int ans [] = new int [oddCount];
		for (int i = 0, j = 0; i < a.length; i++) {
		     if (a[i]%2 != 0) {
				ans[j] = a[i];
				j++;
			}	
		}
		
		System.out.println("The removed all even element array is: "+Arrays.toString(ans));
	}
}
