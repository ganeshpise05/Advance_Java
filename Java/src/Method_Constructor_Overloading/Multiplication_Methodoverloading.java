package Method_Constructor_Overloading;

public class Multiplication_Methodoverloading {

	    // Method to multiply two integers
	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    // Overloaded method to multiply three integers
	    public int multiply(int a, int b, int c) {
	        return a * b * c;
	    }

	    // Overloaded method to multiply two double values
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    // Overloaded method to multiply a double and an integer
	    public double multiply(double a, int b) {
	        return a * b;
	    }

	    public static void main(String[] args) {
	    	Multiplication_Methodoverloading  multiplication = new Multiplication_Methodoverloading ();

	        System.out.println("Multiplication of two integers: " + multiplication.multiply(2, 3));
	        System.out.println("Multiplication of three integers: " + multiplication.multiply(2, 3, 4));
	        System.out.println("Multiplication of two doubles: " + multiplication.multiply(2.5, 3.5));
	        System.out.println("Multiplication of a double and an integer: " + multiplication.multiply(2.5, 3));
	    }
 
}
