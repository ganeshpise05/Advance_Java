package Interface;

public class Vehicle_Driver {

	public static void main(String[] args) {
		 
		Vehicle v1 = new Vehicle_Imp("Wrangler",5,550);
		v1.start();
		v1.accelerate(20);
		v1.brake(100);
		v1.stop();
		
		System.out.println(Vehicle.maxSpeed);
		System.out.println(Vehicle.minSpeed);
	}

}
