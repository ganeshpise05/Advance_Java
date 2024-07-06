package Abstraction;

import java.util.Arrays;

public class Remove_OccurencesOfElements {

	public static void main(String[] args) {
		
		int a [] = {1,2,4,2,4,1,5,6,7,4,3,6,7,8,95,6,3,11,2,34,2,7,43};
		int ref [] = new int [a.length];
		
		int count;
		for (int i = 0; i < a.length; i++) {
			
			if (ref[i] == 0 ) {
				count = 1;
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i] == a[j]) {
						count++;
						ref[j] = -1;
					}
				}
				ref[i] = count;
			}
		}
		
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != -1) {
				System.out.print(a[i]+ " ");
			}
		}
		System.out.println(": all are the Unique Elements i.e we removed duplicates.");
		System.out.println(Arrays.toString(ref));
	}
}
