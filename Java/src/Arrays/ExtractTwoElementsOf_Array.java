package Arrays;


/* Give one array extract one element from start and one from end. 
 * [1,3,5,7,6,4,2]  ---------> (1,2) (3,4) (5,6) (7,7)
 */
public class ExtractTwoElementsOf_Array {

	public static void main(String[] args) {
		
		int [] a = {1,3,5,7,6,4,2};
		
		for (int i = 0,j = a.length-1; i <= j; i++, j--) {
			
			System.out.println("("+a[i]+","+a[j]+")");
		}
	}
}
