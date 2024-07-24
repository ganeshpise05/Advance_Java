package Practice;

import java.util.Arrays;

// Remove Elements : Give an array and remove elements in between given two index.
// [2,34,3545,3,12,34,5,4532,133,67,76,67,86] ---------> [2,34,3545,3,12,67,76,67,86]  5 to 8
public class RemoveElement_InBetween {

	public static void main(String[] args) {
		
		int [] a = {2,34,3545,3,12,34,5,4532,133,67,76,67,86};
		int start = 5;
		int end = 9;
		int diff = end-start;
		
		int ans [] = new int [a.length-diff];
		
		for (int i = 0 ; i < ans.length; i++) {
			
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
