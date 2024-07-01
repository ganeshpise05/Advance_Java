package Arrays;

import java.util.Arrays;

// Take an a array if elements are odd then make it Even.
public class MakeEvenElementsin_Array {

	public static void main(String[] args) {
		
		int [] a = {11,2,33,14,35,6};
		
	    for (int i = 0; i < a.length; i++) {
			
	    	if (a[i]%2!=0) {
				
	    		a[i] = a[i]+1;
			}
		}
	    
	    System.out.println("The array of even elements is: "+Arrays.toString(a));
	}
}
