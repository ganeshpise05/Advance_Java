package Arrays;

import java.util.Arrays;

// Even index element: Give one array and print the even index elements in new array.
public class PEvenIndex2 {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8};
		int ans [] = new int [a.length/2];
		
		for (int i = 0 , j = 0; i < a.length; i++) {
			if (i%2==0) {
				ans[j] = a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
