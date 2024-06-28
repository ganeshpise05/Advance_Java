package Arrays;
import java.util.Arrays;

//Zigzag Array Odd size:Copy the elements from two arrays like one from 1st array and another one from 2nd array .
public class ZigzagCopy_OddSizeElements {

	public static void main(String[] args) {
		
		int [] ar1 = {10,20,30,40,30};
		int [] ar2 = {40,60,70,20,50,10};
		int [] ans = new int[ar1.length+ar2.length];
		
		for (int i = 0,j=0; i < ans.length; i+=2,i++) {
		
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ar1[i];
		}
		
		for (int i =ar1.length,j=0; i < ans.length; i++,j++) {
			ans[i] = ar2[i];
		}
		
		ans[i] = ar1 [j];
		ans[i+1] = ar2 [j];
	   }
		System.out.println("Zogzag copy of Odd elements of given array is: "+Arrays.toString(ans));
	}
}
