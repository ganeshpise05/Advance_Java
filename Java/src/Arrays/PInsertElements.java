package Arrays;

import java.util.Arrays;

// Insert Elements :  In Given Index
// 
public class PInsertElements {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,11,12,13,14,15};
		int b [] = {66,67,68,69,70};
		
		int ans [] = new int [a.length+b.length];
		int index = 5;
		
		for (int i = 0, j = 0; i < ans.length; i++) {
			
			if (i<index) {
				ans[i] = a[i];
			}
			
			else if (i>=index && j<b.length) {
				ans[i] = b[j];
				j++;
			}
			
			else {
                ans[i] = a[i-b.length];
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
