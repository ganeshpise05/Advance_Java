package Arrays;

import java.util.Arrays;

// Even index element : Give an array and print the even index element. [1,2,3,4,5,6,7,8] ---------> [1,3,5,7]

public class PEvenIndex {

	public static void main(String[] args) {
		
		int a []  = {1,2,3,4,5,6,7,8}; 
		
		System.out.println("The element at Even index: ");
		
		for (int i = 0 ; i < a.length; i+=2) {
			System.out.print(a[i]+" ");
		} 
	}
}
