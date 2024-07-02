package Arrays;

import java.util.Arrays;

// Reverse Array : Give the one array and reverse itself. 
public class ReverseArrayItself {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6};
		for (int i = 0,j = a.length-1; i < j; i++,j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println("The reversed array is: "+Arrays.toString(a));
	}
}
