package Arrays;
import java.util.Arrays;

//Zigzag Array Odd size:Copy the elements from two arrays like one from 1st array and another one from 2nd array .
public class ZigzagCopy_OddSizeElements {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		int [] b = {40,60,70,20,50,60,70,80,90};
		int [] c = new int[a.length+b.length];
		
	    if (a.length<b.length) {
			
	    	int j = 0;
	    	for (int i = 0; i < a.length; i++,j+=2) {
				
	    		c[j] = a[i];
	    		c[j+1] = b[i];
			}
	    	
	    	for (int i = a.length; i < b.length; i++,j++) {
				
	    		c[j] = b[i];
			}
		}
	    
	    else if (a.length>b.length) {
			
	    	int i =0;
	    	int j =0;
	    	for ( ; i < b.length;i++,j+=2) {
	    		
				c[j]  = a[i];
				c[j+1] = b[i];
			}
	    	
	    	for ( ; i < a.length; i++,j++) {
				
	    		c[j] = a[i];
			}
		}
		System.out.println("Zigzag copy of Odd elements of given array is: "+Arrays.toString(c));
	}
}
