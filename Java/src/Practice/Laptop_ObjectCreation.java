package Practice;

public class Laptop_ObjectCreation {

	//Attributes/Variables
	String brand;
	String model;
	String processor;
	int ram;
	int storage;
	String os;
	double weight;
	
	Laptop_ObjectCreation(){
		System.out.println("From no argument constructor of Laptop ObjectCreation");
	}
	
	Laptop_ObjectCreation(String brand,String model,String processor,int ram,int storage,String os,double weight){
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.os = os;
		this.weight = weight;
	}
	
	// Method for to print default values of constructor.
	public void displayLaptop() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(processor);
		System.out.println(ram);
		System.out.println(storage);
		System.out.println(os);
		System.out.println(weight);
	}
	
	// Actions/Methods
	
	public void bootUp() {
		System.out.println("Boot up the laptop.");
	}
	
	public void installSoftware() {
		System.out.println("Install the software in your laptop.");
	}
	
	public void connectWifi() {
		System.out.println("Connect the laptop to wifi.");
	}
	
	public void openApp() {
		System.out.println("Click on application & open app.");
	}
	
	public void sleepMode() {
		System.out.println("click on sleep mode.");
	}
	
	public void shutDown() {
		System.out.println("Please shutdown the Laptop.");
	}
	
	public void restart() {
		System.out.println("Please restart our Laptop.");
	}
	
	// Now Creating the Main method to create an Object of Above class.
	
	public static void main(String[] args) {
		
		Laptop_ObjectCreation l1 = new Laptop_ObjectCreation();
		l1.displayLaptop();// No args constructor print by default values of object.
		
		System.out.println(" ");
		
		Laptop_ObjectCreation l2 = new Laptop_ObjectCreation("Lenovo","Lenovo ideapad slim 3","Rayzen 5",8,512,"Windows",1.54);
	    l2.displayLaptop();
	
	    System.out.println(" ");
	    
	    // Now accesing the non-Static methods
	    
	    l2.bootUp();
	    l2.installSoftware();
	    l2.connectWifi();
	    l2.openApp();
	    l2.sleepMode();
	    l2.restart();
	    l2.shutDown();
		
	}
}

