package Exception;

public class Multiple_exe_Example {

	public static void main(String[] args) {
		
		//System.out.println(10/0);
		 
		try {
            // Code that may throw various exceptions
            String str = null;
            System.out.println(str.length()); // This will cause NullPointerException

            String invalidNumber = "ABC";
            int num = Integer.parseInt(invalidNumber); // This will cause NumberFormatException

            int result = 50 / 0; // This will cause ArithmeticException	
		}
		
		catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
            System.out.println("Exception message: " + e.getMessage());
        } 
		
		catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
            System.out.println("Exception message: " + e.getMessage());
        } 
		
		catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
            System.out.println("Exception message: " + e.getMessage());
        } 
		
		catch (Exception e) {
			System.out.println("General Exception caught: " + e);
            System.out.println("Exception message: " + e.getMessage());
		}
		
		catch (Throwable e) {
			System.out.println("Throwable Exception caught: " + e);
            System.out.println("Exception message: " + e.getMessage());
		}
		
		finally {
			System.out.println("This finally block executes by default.");
		}
	}
}
