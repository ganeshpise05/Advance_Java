package Practice;

import java.util.Arrays;

public class ClockwiseRotate1 {

	public static void main(String[] args) {
		
		 int  [] a = {1,2,3,5,6,7,8};
		 for (int j = 0; j < 1; j++ ) {
			 
			 int temp = a[a.length-1];
			 
			 for (int i = a.length-1; i > 0; i--) {
				
				 a[i] = a[i-1];
			}
			 a[0] = temp;
		}
		 System.out.println("Clocwise rotated array i.e Right rotated array : "+Arrays.toString(a));
	}		 
		 
}
