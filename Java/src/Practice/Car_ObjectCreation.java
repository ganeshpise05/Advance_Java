package Practice;

// Creating An a Object of given class

public class Car_ObjectCreation {

	// Attributes
	String brand;
	String model;
	int year;
	String color;
	String engineType;
	int doors;
	String fuelType;
	double milage;
	
	// Constructor
	
	Car_ObjectCreation(){
		System.out.println("This is an no argument constructor/Default Constructor");
	}
	
	Car_ObjectCreation(String brand,String model,int year,String color,String engineType,int doors,String fuelType,double milage){
		
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.engineType = engineType;
		this.doors = doors;
		this.fuelType = fuelType;
		this.milage = milage;
	}
	
	public void displayCar() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
		System.out.println(color);
		System.out.println(engineType);
		System.out.println(doors);
		System.out.println(fuelType);
		System.out.println(milage);
	}
	// Actions
	
	public void startEngine() {
		System.out.println("Start the engine of Car.");
	}
	
	public void stopEngine() {
		System.out.println("Stop the engine of car.");
	}
	
	public void accelerate() {
		System.out.println("Accelerate the car.");
	}
	
	public void brake() {
		System.out.println("Press the break and stop the car.");
	}
	
	public void turnRight() {
		System.out.println("On the right indicator and turn right.");
	}
	
	public void park() {
		System.out.println("Park the car in parking area.");
	}
	
	
	// Main method to create a Car object and perform actions
	
	public static void main(String[] args) {
		
		// No argument constructor/ Default constructor.
		Car_ObjectCreation c1 = new Car_ObjectCreation();
		System.out.println(c1.brand);
		
		System.out.println(" ");
		// Constructor with formal argument.
		Car_ObjectCreation c2 = new Car_ObjectCreation("Range Rover","Defender",2024,"White","V8-turbo",5,"Diesel",8.5);
		System.out.println(c2.brand);
		
		// Calling / Accesing not static methods of class.
		c2.brake();
		c2.turnRight();
		c2.park();
		c2.startEngine();
	}
}
