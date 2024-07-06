package Arrays;

import java.util.Arrays;

public class CountOf_OccurencesofElements {

	public static void main(String[] args) {
		
		int a [] = {1,2,4,2,4,1,5,6,7,4,3,6,7,8,95,6,3,11,2,34,2,7,43};
		int ref [] = new int [a.length];
		
		int count ; 
		
		for (int i = 0; i < a.length; i++) {
			
            if (ref[i] == 0) { // Only count if the element is not marked
                  count = 1;
                  
                for (int j = i + 1; j < a.length; j++) {
                	
                    if (a[i] == a[j]) {
                        count++;
                        ref[j] = -1; // Mark duplicates
                    }
                }
                ref[i] = count; // Store count of the element
            }
        }

		
		System.out.println(Arrays.toString(ref));
 	}
}
