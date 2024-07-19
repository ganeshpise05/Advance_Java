package Abstraction;

public class Vehicle_CarDriver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car();
		v1.start();
		v1.stop();
		v1.accelerate();
		v1.brake();
		v1.fuel();
		v1.detail();
	}
}
