package Arrays;


// Print the odd elements from the given array. [1,2,3,4,5,6]  -------->  1,3,5

public class PrintOddElementsFrom_Array {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 != 0) {
				System.out.println("Odd elements from given array is:"+a[i]);
			}
		}
	}
}
