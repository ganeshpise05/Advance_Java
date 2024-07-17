package Arrays;

import java.util.Arrays;

// Merge to array: Give an a two arrays and store in new array by ascending order.
// a=[1,3,4,6,8,9] 
// b=[12,3,5,2,7,10,11,3]
// ans=[1,2,3,3,3,4,5,6,7,8,9,10,11,12]

public class MergeTwoArrays_Asc {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,7,9,20,12,11};
		int b[] = {2,4,19,6,8,10,12,13,14,16};
		int ans[] = new int [a.length+b.length];
		
		//int i,j,k;
		int i = 0,j = 0,k = 0;
		//for (i = 0,j = 0,k = 0; i < ans.length; )
		while (i<ans.length ){
			
			if (a[i]<b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			}
			
			else if (a[i]>b[j]) {
				ans[k] = b[j];
				j++;
				k++;
			}
			
		   if (i==a.length || j==b.length) {
			   break;
		  }
		}
		
		if (i<a.length) {
			while (i<a.length) {
				ans[k] = a[i];
				i++;
				k++;
			}
		}
		
		else if (j<b.length) {
			while (j<b.length) {
				ans[k] = b[j];
				j++;
				k++;
			}
		}
		
		System.out.println("The merged two arrays in Asc order is: "+Arrays.toString(ans));
	}
}
