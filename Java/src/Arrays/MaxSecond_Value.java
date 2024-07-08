package Arrays;

// Second max Element: Give an a array and find the second maximum value of given array.
// [1,2,3,4,4,5,6,7,8,9]  ------> Second Max : 8

public class MaxSecond_Value {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				 secMax = max;
				 max = a[i];
			}
			
			else if (a[i]>secMax && max!=secMax) {
				secMax = a[i];
			}
		}
		System.out.println("The First Max element is: "+max);
		System.out.println("The Second Max element is: "+secMax);
	}
}
