package Arrays;

import java.util.Arrays;

// Sort Positive and Negative: Give an a array and sort the elements like all negative are left side and all Positive is in right side.
// [1,2,-1,3,5,-6,4,-7,-8,9,-2] ----->
public class Positive_NegativeSort {

	public static void main(String[] args) {
		
		int a[] = {1,2,-1,3,5,-6,4,-7,-8,9,-2};
		
		for (int i = 0 , j = a.length-1; i < j; ) {
			
			if (a[i] > 0 && a[j] < 0) {
				int temp = a[i] ;
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--; 
			}
			
			else if (a[i] > 0 && a[j] > 0) {
                j--;
            }
			
			else if (a[i] < 0 && a[j] > 0) {
                i++;
                j--;
            } 
			
			else if (a[i] < 0 && a[j] < 0) {
                i++;
            }
		}
			
			System.out.println(Arrays.toString(a));
	}
}
