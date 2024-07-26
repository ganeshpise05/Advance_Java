package Method_Constructor_Overloading;

public class Cars {
	 
	    private String make;
	    private String model;
	    private int year;

	    // Constructor with no parameters
	    public Cars() {
	        this.make = "Unknown";
	        this.model = "Unknown";
	        this.year = 0;
	    }

	    // Constructor with one parameter
	    public Cars(String make) {
	        this.make = make;
	        this.model = "Unknown";
	        this.year = 0;
	    }

	    // Constructor with two parameters
	    public Cars(String make, String model) {
	        this.make = make;
	        this.model = model;
	        this.year = 0;
	    }

	    // Constructor with three parameters
	    public Cars(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public void display() {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }

	    public static void main(String[] args) {
	        Cars car1 = new Cars();
	        Cars car2 = new Cars("Toyota");
	        Cars car3 = new Cars("Toyota", "Camry");
	        Cars car4 = new Cars("Toyota", "Camry", 2020);

	        car1.display();
	        System.out.println();
	        car2.display();
	        System.out.println();
	        car3.display();
	        System.out.println();
	        car4.display();
	    }
 
}
