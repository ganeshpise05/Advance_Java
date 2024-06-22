package Method_Constructor_Overloading;

public class Laptop {
	 
	    private String brand;
	    private String model;
	    private double price;

	    // Constructor with no parameters
	    public Laptop() {
	        this.brand = "Unknown";
	        this.model = "Unknown";
	        this.price = 0.0;
	    }

	    // Constructor with one parameter
	    public Laptop(String brand) {
	        this.brand = brand;
	        this.model = "Unknown";
	        this.price = 0.0;
	    }

	    // Constructor with two parameters
	    public Laptop(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	        this.price = 0.0;
	    }

	    // Constructor with three parameters
	    public Laptop(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    public void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: $" + price);
	    }

	    public static void main(String[] args) {
	        Laptop laptop1 = new Laptop();
	        Laptop laptop2 = new Laptop("Dell");
	        Laptop laptop3 = new Laptop("Dell", "XPS 13");
	        Laptop laptop4 = new Laptop("Dell", "XPS 13", 999.99);

	        laptop1.display();
	        System.out.println();
	        laptop2.display();
	        System.out.println();
	        laptop3.display();
	        System.out.println();
	        laptop4.display();
	    }
	 
}
