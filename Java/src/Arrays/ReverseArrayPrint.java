package Arrays;
 

//Give an a array print it into reverse direction. [1,2,3,4,5,6] ------->  [6,5,4,3,2,1]
public class ReverseArrayPrint {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,5,6,7,8};
		
		for (int i = a.length-1; i >=0 ; i--) {
			
			System.out.print(a[i]+" ");
		}
		
	}
}
