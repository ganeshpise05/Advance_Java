package Exception;

//Example 1: Handling ArithmeticException

public class Arithmatic {

	public static void main(String[] args) {
		
		try {
			int ans = 10/0;
			System.out.println(ans);
		} 
		
		catch (ArithmeticException ae) {
		    System.out.println("You can't divide any number by Zero..");
		}
	}
}
