package Abstraction;

public  abstract class Vehicle {

	public abstract void start();
	public abstract void stop();
	public abstract void accelerate();
	public abstract void brake();
	public abstract void fuel();
	public void detail()
	{
		System.out.println("This are details of Vehicle.");
	}
}
