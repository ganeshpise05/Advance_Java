package Arrays;
import java.util.Arrays;

//5:Reverse the array by itself.
public class Reverse_Itself {

	public static void main(String[] args) {
		
		int [] a = {10,20,40,30,20,70};
		
		for (int i = 0,j = a.length-1; i < j; i++,j--) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		System.out.println("The reverse array of given array by itself is: "+ Arrays.toString(a));
	}
}
