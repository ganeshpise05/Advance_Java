package Interface;

public class Vehicle_Imp implements Vehicle {
	
	String name ;
	int door;
	int power;
	
	public Vehicle_Imp() {}
	
	public Vehicle_Imp(String name,int door,int power) 
	{
		super();
		this.name=name;
		this.door=door;
		this.power=power;
	}
	
	public void displayVehicleimp()
	{
		System.out.println(name);
		System.out.println(door);
		System.out.println(power);
	}

	public void start()
	{
		System.out.println("Please pluge on the key &  Rotate to start.");
	}
	
	public void stop()
	{
		System.out.println("If any object comes in front of bike Stop the Bike !!");
	}
	
	public void accelerate(int speed)
	{
		System.out.println("When your bike speed is "+speed+" then Accelerate.");
	}
	
	public void brake(int speed)
	{
		System.out.println("When your bike speed is above "+speed+" then press Brake");
	}
}
