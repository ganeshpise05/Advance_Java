package Exception;

public class Finally_exe {

	public static void main(String[] args) {
		
		try {
			String str=null;
			System.out.println(str); 
			System.out.println(str.length());
			
			
		} 
		
		catch (NullPointerException e) {
			 System.out.println("please do't initialize var value as null.");
		}
		
		catch (Exception e) {
			 System.out.println("From exception exe block.");
		}
		
		catch (Throwable te) {
			 System.out.println("From throwable exception block");
		}
		
		//This is the by default block it execute after try and catch.
		
		//When exception occur outside the try and catch block the Finally block executed.
		//If exception is occured in try block and not handled,but still Finally block get executed.
		
		finally {
			System.out.println("This block can excuted without call or invoke.");
		}
	}
}
