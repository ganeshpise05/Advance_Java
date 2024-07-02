package Arrays;


// Print the even elements from the array.[1,2,3,4,5,6]  ----->  2,4,6

public class PrintEvenElementsFrom_Array {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6};
		
	    for (int i = 0; i < a.length; i++) {
	    	
			if (a[i] % 2 == 0) {
				System.out.println("The even elements from array is: "+a[i]+" ");
			}
	    	
		} 
	}
}
