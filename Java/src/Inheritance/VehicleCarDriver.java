package Inheritance;

public class VehicleCarDriver {

	public static void main(String[] args) {
		 
		Car c1 = new Car(2022,3,320,9);
		c1.displayCar();
		c1.displayVehicle();
		
		Vehicle v1 = c1; //upcasting
		v1.displayVehicle();
		//v1.displayCar(); can't access members/methods of child class.
		
	}

}
