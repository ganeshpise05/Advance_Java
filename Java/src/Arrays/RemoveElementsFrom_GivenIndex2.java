package Arrays;

import java.util.Arrays;
import java.util.Iterator;

// Remove Elements of Given array: Give an a array and remove the elements from the index 6 to 10.
// [1,2,3,4,5,6,7,8,9,10,11,12,13]  -------> [1,2,3,4,5,6,11,12,13]

public class RemoveElementsFrom_GivenIndex2 {

	public static void main(String[] args) {
		
		int start = 6;
		int end = 10;
		int diff = end - start;
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int ans [] = new int [a.length-diff];
		
		 for (int i = 0; i < ans.length; i++) {
			
			 if (i < start) {
				ans[i] = a[i];
			} 
			 
			 else {
                ans[i] = a[i+diff];
			}
		}
		 System.out.println(Arrays.toString(ans));
	}
}
