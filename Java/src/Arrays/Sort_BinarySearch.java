package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Binary Search: Give an array and sort the array elements by using the binary seaarch
// Give start and end of given array
// Find mid of array start+end/2 = mid

public class Sort_BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {3,2,5,6,55,343,12,67,787,874,32,11,978,87,323,112,435};
		int start = 0;
		int end = a.length-1;
		int mid = (start+end)/2;
		Arrays.sort(a);
		
		System.out.println("Enter element you want to search:");
		int search = sc.nextInt();
		
		while (start<=end) {
			if (a[mid] == search) {
				System.out.println("Element "+search+" is found at index "+mid);
				break;
			}
			
			else if (search > a[mid]) {
				start = mid+1;
			}
			
			else if (search < a[mid]) {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		if (start > end) {
			System.out.println("The element "+ search+ " is not found.");
		}
	}
}
