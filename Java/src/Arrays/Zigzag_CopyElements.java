package Arrays;

import java.util.Arrays;

//Zigzag Array:Copy the elements from two arrays like one from 1st array and another one from 2nd array. 
public class Zigzag_CopyElements {
	
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60};
		int [] b = {90,80,70,60,50,40};
		int [] ans = new int [a.length+b.length];
		
		for (int i = 0,j=0; i < ans.length; i+=2,i++) {
			
	
		for (int i = 0; i < a.length; i++) {
			ans[i] = a[i];
		}
		
		for (int i=a.length ,j = 0;i < ans.length;i++,j++) {
		    ans[i] = b[i];	
		}
		ans[i] = a [j];
		ans[i+1] = b[j];
	   }
		System.out.println("When above two arrays are merged then their combined array is: "+Arrays.toString(ans));
	}

}
