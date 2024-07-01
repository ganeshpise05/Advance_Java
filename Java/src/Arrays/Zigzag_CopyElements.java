package Arrays;

import java.util.Arrays;

//Zigzag Array Even size:Copy the elements from two arrays like one from 1st array and another one from 2nd array . 
public class Zigzag_CopyElements {
	
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60};
		int [] b = {1,2,3,4,5,6};
		int [] ans = new int [a.length+b.length];
		
		for (int i = 0; i < ans.length; i++) {
			
	      if (i==0 || i%2==0) {
			ans[i] = a[i];
		} 
	      
	      else {
              int j = 0;
              ans[i] = b[j];
              j++;
		  }
		}
		System.out.println("When above two arrays are merged then their combined array is: "+Arrays.toString(ans));
	}

}
