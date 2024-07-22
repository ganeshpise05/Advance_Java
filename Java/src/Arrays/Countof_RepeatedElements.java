package Arrays;

import java.util.Arrays;

public class Countof_RepeatedElements {

	public static void main(String[] args) {
		
		int a [] = {1,1,1,1,1,2,2,2,2,3,3,4,4,4,5,6,7};
		int ref [] = new int [a.length];
		
		int count; 
		for (int i = 0; i < a.length; i++) {
			
			if (ref[i] == 0) {
				count =1;
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i] == a[j]) {
						count++;
						ref[j] = -1;
					}
				}
				ref[i] = count;
				
				System.out.println("count of "+a[i]+" is repeated: "+count +" times.");
			}
			
		}
		System.out.println(Arrays.toString(ref));
	}
}
