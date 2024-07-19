package Abstraction;

public class Car extends Vehicle {

	@Override
	public void start() {
		 System.out.println("Car was Started.");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping"); 
	}

	@Override
	public void accelerate() {
		 System.out.println("car was accelerated.");
	}

	@Override
	public void brake() {
		System.out.println("Car was braked.");
	}

	@Override
	public void fuel() {
		 System.out.println("Car fuel is empty.");
	}

}
