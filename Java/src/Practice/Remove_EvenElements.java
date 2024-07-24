package Practice;

import java.util.Arrays; 

public class Remove_EvenElements {

	public static void main(String[] args) {
		
		int a [] = {2,1,33,43,22,44,76,56,89,2,1,98};
		 
		// First count the number of even elements
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        int ans [] = new int [oddCount];
        
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				ans[j] = a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
