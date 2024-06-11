package Inheritance;

public class Vehicle {
	
	int speed;
	int milage;
	
	public Vehicle()
	{
		
	}
	
	Vehicle(int speed,int milage)
	{
		this.milage=milage;
		this.speed=speed;
	}
	
	public void displayVehicle()
	{
		System.out.println(milage);
		System.out.println(speed);
	}

}
