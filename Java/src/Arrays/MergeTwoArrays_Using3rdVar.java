package Arrays;

import java.util.Arrays;

public class MergeTwoArrays_Using3rdVar {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60};
		int [] b = {90,80,70,60,50,40};
		int [] ans = new int[a.length + b.length];
		
	    for (int i = 0; i < a.length; i++) {
			ans[i] = a[i];
		} 
	    
	    for (int i = a.length,j=0; i < ans.length; i++,j++) {
			ans[i] = b[j];
		}
	    System.out.println("When above two arrays are merged then their combined array is: "+Arrays.toString(ans));
	}	
}
