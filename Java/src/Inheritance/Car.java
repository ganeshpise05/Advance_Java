package Inheritance;

public class Car extends Vehicle {
	
	       int model;
	       int doors;
	       
	       public Car()
	       {
	    	   
	       }
	       
	       Car(int model,int doors,int speed,int milage)
	       {
	    	   super(speed,milage);
	    	   this.doors=doors;
	    	   this.model=model;
	       }
	       
	       public void displayCar()
	       {
	    	   System.out.println(doors);
	    	   System.out.println(model);
	       }

}
