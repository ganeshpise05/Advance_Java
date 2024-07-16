package Arrays;

import java.util.Arrays;

//Remove Even Index Elements : Give an one array and remove the even index elements.
//[1,2,3,4,5,6,7,8] ------->  [2,4,6,8]
public class PRemoveElementsEvenIndex {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9,10,11};
		int ans [] = new int [a.length/2+1];
		
		for (int i = 0, j = 0; i < a.length; i++) {
			if (i%2!=0) {
				ans[j] = a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
