package Arrays;

// Give an a array sum the all elements. [1,2,3,4,5,6]  -------> Sum: 21

public class SumOfElementsOf_Array {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("The sum of given array elements is: "+sum);
	}
}
