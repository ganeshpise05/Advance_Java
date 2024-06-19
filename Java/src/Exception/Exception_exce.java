package Exception;

public class Exception_exce {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
		} 
		
		catch (ArithmeticException ae) {
			 
			System.out.println("You can not divide any number by Zero.");
		}
		
		//we can not write the below exception block above the block of ArithmaticException 
	    //Below block can excute the all exceptions i.e it can handles any exception.
		//It is Exception class is  parent class of Arithmatic,Nullpointer,NumberFormat,Indexoutof,InputmissMatch exception,
		//and it is child class of Throwable class 
		
		//Flowchart : top to bottom ---> Throwable ->Exception ->Arithmatic ->Nullpointer ->NumberFormat ->IndexOutof ->InputmissMatch
		
		//But in programming it can be reverse order of above.
		
		catch (Exception e) {
			 
			System.out.println("From Exception block.");
		}
	}

}
