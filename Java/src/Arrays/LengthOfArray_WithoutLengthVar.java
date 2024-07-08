package Arrays;

// Length of Array: Give one array and measures the length without using Length variable/function.

public class LengthOfArray_WithoutLengthVar {

	public static void main(String[] args) {
		
		int a[]  = {1,2,3,4,5,6,7,7,8,9};
		int count = 0;
		try {
			
			for (int i = 0; ; i++) {
				a[i] = a[i];
				count++;
			}
		} 
		
		catch (Exception e) {
		    System.out.println("The Length of given array is: "+ count);	 
		}
	}
}
