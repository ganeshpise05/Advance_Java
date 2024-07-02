package Arrays;

import java.util.Arrays;

//Merge two arrays using third array. [1,2,3,4] + [50,60,70] ----------> [1,2,3,4,50,60,70]
public class MergeTwoArrays_Using3rd {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4};
		int b [] = {50,60,70};
		int ans [] = new int [a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {

			ans[i]  = a[i];
		}
		int j = 0;
		for (int i = a.length ; i < ans.length; i++,j++) {
			
			ans[i] = b[j];
		}
		
		System.out.println("The merged array is: "+Arrays.toString(ans));
	}
}
