package Arrays;


//7:Check the elements in given array if the array is reversed but unchanged position elements print.

public class Unchanged_PositionElementsAfterReverse {

	public static void main(String[] args) {
		
		int[] a = {1,3,2,4,5,4,2,3,8};
		
		for (int i = 0; i < (a.length/2); i++) {
			
			if (a[i]==a[a.length-i-1]) {
				
				System.out.println("The unchanged position elements are: "+a[i]);
			}
		}
		
	}
}
