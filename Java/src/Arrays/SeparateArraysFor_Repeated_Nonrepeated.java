package Arrays;

import java.util.Arrays;

//  Separate arrays : Give an a array and create the separate arrays for repeated and non repeated elements.
public class SeparateArraysFor_Repeated_Nonrepeated {

	public static void main(String[] args) {
		
		int [] a = {1,1,1,1,2,2,2,3,3,3,3,3,3,4,4,4,5,5,6,7,8,9,9,9};
		int ref [] = new int [a.length];
		
		//int [] repeated = new int [ref.length-];
		//int [] nonRepeated = new int [ref.length-];
		
		int count2 = 0;
		int count;
		for (int i = 0; i < a.length; i++) {
			if (ref[i] == 0) {
				count = 0;
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						ref[j] = -1;
					}
				}
				ref[i] = count;
				System.out.println("The element "+a[i]+" is repeated "+count + " times.");
			}
			
		}
		System.out.println(Arrays.toString(ref));
		
	}
}
