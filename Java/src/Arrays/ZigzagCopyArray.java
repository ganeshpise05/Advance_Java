package Arrays;

import java.util.Iterator;

// Zigzag Array: Copy one element from array a and one from b . [1,2,3,4,5,6] and [10,20,30,40,50,60] -----> [1,10,2,20,3,30,4,40,5,50,6,60]
public class ZigzagCopyArray {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6};
		int b [] = {10,20,30,40,50,60};
		int ans [] = new int [a.length+b.length];
		
	    for (int i = 0,j=0; i < ans.length; i++,j+=2) {
			ans[j] = a[i];
			System.out.println(ans[j]);
		}
	}
}
