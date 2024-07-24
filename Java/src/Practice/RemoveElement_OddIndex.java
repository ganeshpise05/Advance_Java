package Practice;

import java.util.Arrays;

// Remove odd Index Elements.
public class RemoveElement_OddIndex {

	public static void main(String[] args) {
		
	     int [] a = {20,3,2,5,6,74,1,3};
	     int ans [] = new int [a.length/2];
	     
	     for (int i = 0, j = 0; i < a.length; i++) {
			if (i%2==0) {
				ans[j] = a[i];
				j++;
			}
		}
	    System.out.println(Arrays.toString(ans));
	}
}
