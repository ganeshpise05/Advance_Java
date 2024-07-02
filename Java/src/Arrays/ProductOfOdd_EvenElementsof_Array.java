package Arrays;

// Product of Even and odd elements of an a Array.

public class ProductOfOdd_EvenElementsof_Array {

	public static void main(String[] args) {
		
		int a [] = {12,3,45,6,8,9,11};
		int eProduct = 1;
		int oProduct = 1;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2==0) {
				eProduct = eProduct*a[i];
			} 
			
			else {
               oProduct = oProduct*a[i];
			}
		}
		System.out.println("The product of Even elements: "+eProduct);
		System.out.println("The product of Odd elements: "+oProduct);
	}
}
