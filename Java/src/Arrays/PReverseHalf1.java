package Arrays;

import java.util.Arrays;

// Reverse Array: Half reverse array even size. [1,2,3,4,5,6,7,8] ------->  [1,2,3,4,8,7,6,5]

public class PReverseHalf1 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8};
		int mid = a.length/2;
		
		for (int i = 0; i < mid/2; i++) {
			int temp =a[mid+i];
			a[mid+i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
//		for (int i = a.length/2+1 , j =a.length-1 ; i > j; i++,j--) {
//			int temp = a[i];
//			a[i] = a[j];
//			a[j] = temp;
//			System.out.println(Arrays.toString(a));
//		}
		System.out.println(Arrays.toString(a));
	}
}
