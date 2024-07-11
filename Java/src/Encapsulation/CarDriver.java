package Encapsulation;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		// Creating setter methods for C1
		c1.setMake("Toyota");
		c1.setModel("Supraa");
		c1.setColor("White");
		c1.setYear(1960);
		
		System.out.println("\nCar 1:");
		System.out.println("Maked By: "+c1.getMake());
		System.out.println("Model: "+c1.getModel());
		System.out.println("Color: "+c1.getColor());
		System.out.println("Manufacture Year: "+c1.getYear());
		
		Car c2 = new Car("Range Rover","Defender",2024,"Black","MH45SF2205",7,"Diesel");
		
		// Creating getter mothods for Car C2
		System.out.println("\nCar 2:");
		System.out.println("Maked By: "+c2.getMake());
		System.out.println("Model: "+c2.getModel());
		System.out.println("Manufactured Year: "+c2.getYear());
		System.out.println("Color: "+c2.getColor());
		System.out.println("Locense Number pLate: "+c2.getLicensePlate());
		System.out.println("Milage: "+c2.getMilage()+" Km/l");
		System.out.println("Fuel: "+c2.getFuel());
	}
}

//String make,String model,int year,String color,String licensePlate,int milage,String fuel