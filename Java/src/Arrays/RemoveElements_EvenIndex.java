package Arrays;

import java.util.Arrays;

//Remove Elements: Give one array and remove the even index elements in array.
//[1,2,3,4,5,6,7,8,9] -----> [1,3,5,7,9]

public class RemoveElements_EvenIndex {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		int newSize = (a.length+1)/2;
		
		int ans [] = new int [newSize];
		for (int i = 0,j = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				ans[j] = a[i];
				j++;
			}
		}
		System.out.println("Even index elements removed array is: "+Arrays.toString(ans));
	}
}
