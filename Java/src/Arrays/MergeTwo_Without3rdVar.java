package Arrays;

import java.util.Arrays;

//Merge two Arrays & Store without using third variable.
public class MergeTwo_Without3rdVar {

	public static void main(String[] args) {
	
	int [] a = {10,20,30,40,50,60};
	int [] b = {90,80,70,60,50,40};
	int [] ans= new int [a.length+b.length];
	
	for(int i=0;i<ans.length;i++) {
		
		 if (i<a.length) { 
			ans[i]=a[i];
		} 
		 
		 else {
            ans[i]=b[i-a.length];
		}
	 }
	 System.out.println("When above two arrays are merged then their combined array is: "+Arrays.toString(ans));
  }
}
