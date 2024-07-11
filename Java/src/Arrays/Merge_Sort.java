package Arrays;

import java.util.Arrays;

// Merge Sort: Give an one array 254
public class Merge_Sort {
	
	// 3: Main Method 
	public static void main(String[] args) {
		
		int a[] = {100,82,5,20,73,91,11,21,13};
		mergeSort(a,0,a.length-1);
		
		// Print the sorted array using Arrays.toString()
        System.out.println("Sorted array: " + Arrays.toString(a));
	}
	
	// 1: Merging array method.
	public static void merge(int[] a, int start,int mid,int end)
	{
		int [] ans = new int [a.length];
		int i = start, j = mid+1 , k = start;
		
		while (i<=mid && j<=end)
		{
			if (a[i]<a[j])
			{
				ans[k] = a[i];
				i++;
				k++;
			} 
		
			else {
                 ans[k] = a[j];
                 j++;
                 k++;
			}
		}
			
			// Copy remaining elements of left half, if any
			while (i<=mid) {
				ans[k] = a[i];
				i++;
				k++;
			}
			
			 // Copy remaining elements of right half, if any
			while (j<=end) {
				ans[k] = a[j];
				j++;
				k++;
			}
			
			 // Copy the merged elements back into the original array
			for (int k2 = start; k2 <= end; k2++) {
				a[k2] = ans[k2];
			} 
	}
	
	// 2: Creating method of MergeSort and it uses the merge method
	public static void mergeSort(int [] a,int start,int end)
	{
		if (start<end)
		{
			int mid = (start+end)/2;
			
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			
			merge(a,start,mid,end);
		}
	}
	
}
