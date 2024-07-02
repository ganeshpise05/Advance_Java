package Arrays;


// Product of elements of an a Array. [1,2,3,4,5] ---------> 120
public class ProductOfElementsOf_Array {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5};
		int product = 1;
		
		for (int i = 0; i < a.length; i++) {
			
			product = product*a[i];
		}
		System.out.println("The product of elements of array: "+ product);
	}
}
