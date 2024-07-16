package Arrays;

import java.util.Arrays;

// Even odd Element: Give one array if element are odd then make it even. [1,3,6,7,11,13,10,2,4]  ----------> [2,4,6,8,12,14,10,2,4]
public class PEvenOddElement {

  public static void main(String[] args) {
	
		int a [] = {1,3,6,7,11,13,10,2,4};
		int ans [] = new int [a.length];
		
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				ans[j] = a[i]+1;
				j++;
			}
			else {
				ans[j] = a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
  }
}
