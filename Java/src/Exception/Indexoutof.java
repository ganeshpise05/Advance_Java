package Exception;

//Example 4: Handling ArrayIndexOutOfBoundsException

public class Indexoutof {
	
	public static void main(String[] args) {
		
		 try {
	            int[] arr = new int[5];
	            arr[10] = 50; // This will cause ArrayIndexOutOfBoundsException
	        } 
		 
		 catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Indexoutof caught: Array index out of bounds.");
	        }
	}

}