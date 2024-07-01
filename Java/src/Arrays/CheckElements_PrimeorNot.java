package Arrays;

import java.util.Iterator;

public class CheckElements_PrimeorNot {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,11,13,14};
		int ans [] = new int [a.length - countOfPrimeElements(a)];
	}

	 
	
	public static int countOfPrimeElements(int[] a) {
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 2; j < a[i]; j++) {
				
				if (j%i == 0) {
					
					break;
					
				} 
			 }
		 }
		return count ;
	}
	
	public static boolean isPrimeElement(int[] a) {
		
	   for (int i = 2; i < a[i]; i++) {
		   
		   if(a[i]%i==0)
			{
				break;
			}
	   }
	   
	   return i == a[i];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
