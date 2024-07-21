package Exception;

public class Test5 {

public static void main(String[] args) {
		
		try {
			
			throw new NullPointerException("Hello");
		}
		
		catch (ArithmeticException e) {
			
			 System.out.println("B");
			 
		}
	}
}
