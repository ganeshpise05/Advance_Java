package Arrays;

//6:Check the given array is palindrome or not.
public class Palindrome_Array {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,2,1};
		
		int left = 0;
        int right = a.length - 1;
        
        while (left<right) {
        	
			if (a[left] != a[right]) {  
              break;			
			}
			
			left++;
			right--
		}
        
        System.out.println("The given array "+a+" is palindrome.");
	}
}
