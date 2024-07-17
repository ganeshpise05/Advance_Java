package Arrays;
 

//Give an array print the all positive and negative elements.
public class PositiveNegativeElementsPrint {

	public static void main(String[] args) {
		
		int [] a = {1,-3,6,-67,-34,78,4,920,-234,67,0};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>0) {
				System.out.print(a[i]+" ");
			} 
		}
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
