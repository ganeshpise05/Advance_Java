package Practice;

public class Bicycle_ObjectCreation {

	// Attributes/Variables
	
	String brand;
	String model;
	String color;
	double weight;
	int gears;
	int srno;
	String braketype;
	
	Bicycle_ObjectCreation (){
		System.out.println("From bicycle class");
	}
	
	Bicycle_ObjectCreation(String brand,String model,String color,double weight,int gears,int srno,String braketype){
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.weight = weight;
		this.gears = gears;
		this.srno = srno;
		this.braketype = braketype;
	}
	
	// Printing by default value by using below method.
	public void displayBicycle() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(color);
		System.out.println(weight);
		System.out.println(gears);
		System.out.println(srno);
		System.out.println(braketype);
	}
	
	// Actions/Non-Static methods
	
	public void brake() {
		System.out.println("Press the beakes.");
	}
	
	public void changeGear() {
		System.out.println("change the gear.");
	}
	
	public void ringBell() {
		System.out.println("Press bell and ring.");
	}
	
	public void turnLeft() {
	   System.out.println("Turn left.");
	}
	
	public void adjustSeat() {
		System.out.println("Adjust the seat of bicycle.");
	}
	
	public void lockBicycle() {
		System.out.println("Lock the bicycle.");
	}
	
	// Now creating object of Bicycle by using the constructors of above class.
	
	public static void main(String[] args) {
		
		Bicycle_ObjectCreation b1 = new Bicycle_ObjectCreation();
		b1.displayBicycle();
		System.out.println(b1); // obj ref address of object b1
		
		System.out.println(" ");
		
		// From argument constructor
		
		Bicycle_ObjectCreation b2  = new Bicycle_ObjectCreation("Firefox","Mountain bicycle","Black",20.3,5,23425345,"Disk Brakes");
		b2.displayBicycle();
		
		// Now accesing the Actions/Methods 
		b2.brake();
		b2.changeGear();
		b2.ringBell();
		b2.turnLeft();
		b2.adjustSeat();
		b2.lockBicycle();
	}
}
