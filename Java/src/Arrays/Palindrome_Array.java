package Arrays;

import java.util.Arrays;

//6:Check the given array is palindrome or not.
public class Palindrome_Array {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,2,1};
		
		int i,j;
		
	     for (i = 0,j=a.length-1; i<=j; i++,j--) {
			  if (a[i]!=a[j]) {
				break;
			}
		}
	     
	     
        if ( i>j) {
        	System.out.println("The given array "+Arrays.toString(a)+" is palindrome.");
		} 
        
        else {
			System.out.println("The given array "+Arrays.toString(a)+" is not palindrome.");
		}  
	}
}
