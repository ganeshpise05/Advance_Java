package Arrays;
 

// Max Value: Give an a array and find the first maximum value.
// [1,2,3,4,5,6,7,8,9]  -----> 9
public class Max_Value {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,7,8,9,1,5,6,77,8,76};
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("The max element in given array is: "+max);
	}
}
