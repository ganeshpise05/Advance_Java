package Modifiers;

//Final Methods

//Final methods can be Inherited but can not be override.

public class Final_Methods {
  
		public final void test() {
	       System.out.println("From Non-static final test() method of class Final_Method.");
	    }
		
		public static final void demo() {
			System.out.println("From Static final demo() method of class Final_Method.");
			System.out.println(" ");
		}
		
		
		public static void main(String[] args) {
			
			Final_Methods f1 = new Final_Methods();
			f1.test();
			f1.demo(); //or
			
			Final_Methods.demo();
		}
}
