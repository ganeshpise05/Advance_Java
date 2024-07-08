package Arrays;

// Min Value: Give one array and find out the minimum value in given array.
// [1,-2,4,5,-2,-5,7,8,4,-12,-45]  ------> Min Value: -45

public class Min_Value {

	public static void main(String[] args) {
		
		int [] a = {1,-2,4,-55,-2,-5,7,8,4,-12,-45};
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("The minimum value in given array is: "+min);
	}
}
