package Method_Constructor_Overloading;

public class Calculator_MethodOverloading {
	  
	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Overloaded method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Overloaded method to add two double values
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Overloaded method to add two strings
	    public String add(String a, String b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	Calculator_MethodOverloading calculator = new Calculator_MethodOverloading();

	        System.out.println("Addition of two integers: " + calculator.add(10, 20));
	        System.out.println("Addition of three integers: " + calculator.add(10, 20, 30));
	        System.out.println("Addition of two doubles: " + calculator.add(10.5, 20.5));
	        System.out.println("Addition of two strings: " + calculator.add("Hello, ", "World!"));
	    }
 
}
