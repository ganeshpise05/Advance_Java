package Method_Constructor_Overloading;

public class Datatype_MethodOverloading { 
	
	
	    // Method to display an integer
	    public void show(int a) {
	        System.out.println("Integer: " + a);
	    }

	    // Overloaded method to display a double
	    public void show(double a) {
	        System.out.println("Double: " + a);
	    }

	    // Overloaded method to display a string
	    public void show(String a) {
	        System.out.println("String: " + a);
	    }

	    // Overloaded method to display a character
	    public void show(char a) {
	        System.out.println("Character: " + a);
	    }

	    public static void main(String[] args) {
	    	Datatype_MethodOverloading display = new Datatype_MethodOverloading();

	        display.show(10);
	        display.show(10.5);
	        display.show("Hello");
	        display.show('A');
	    }
 
}
