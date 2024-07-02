package Arrays;


/* Give an a one array sum the all even elements of array and sum the all odd elements of an a array. 
 * [1,2,3,4,5,6]
 * eSum = 12
 * oSum = 9
 */

public class SumOfOdd_Even_ElementsofArray {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6};
		int eSum = 0;
		int oSum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2==0) {
				eSum = eSum+a[i];
			} 
			
			else {
               oSum  = oSum+a[i];
			}
		}
		System.out.println("The additiom of Even elements is: "+eSum);
		System.out.print("The additiom of Odd elements is: "+oSum);
	}
}
