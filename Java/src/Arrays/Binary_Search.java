package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = {1,18,9,4,20,7,8,3,6,12,17,15,5};
		Arrays.sort(a);
		
		System.out.print("Enter element you want to Search: ");
		int search = sc.nextInt();
		
		int start = 0;
		int end = a.length-1;
		int mid = (start+end)/2;
		
		  while (start<=end) {
			
			 if (a[mid]==search) {
				System.out.println("The element "+search+" is found at index "+mid);
				break;
			}
			 else if (search>a[mid]) {
				start = mid+1;
			}
			 else {
				end = mid-1;
			}
			 
			 mid = (start+end)/2;
		} 
		 
		  if ( start>end) {
			  System.out.println("The element "+search+" was not found");
		} 
	}
}
