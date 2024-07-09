package Arrays;

import java.util.Arrays;

// Sort Array: Give an array and sort by using the sort by reference i.e creating sort method.

public class Sort_PassbyReference {

	public static void main(String[] args) {
		
		int a1 [] = {2,6,1,8,9,5,3,6,7};
		sort(a1);
		System.out.println(Arrays.toString(a1));
	}
	public static void sort(int [] a)
	{
//		int a[] = {9,8,7,6,5,4,3,2,1};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
