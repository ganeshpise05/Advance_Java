package Practice;

// Constructor chaining: Using this() call statement 
// Constructor chaining is only happened in same class not other class.

public class Car_ConstructorChaining {

	   String name;
	   String power;
	   int make;
	   int door;
	   double price;
	   double milage;
	   
	   String color;
	   String insurance;
	   int seats;
	   
	  Car_ConstructorChaining (){
		  System.out.println("From no argument constructor.");
	  }
	  
	  Car_ConstructorChaining (String name,String power,int make,int door,double price,double milage){
		 this.name = name;
		 this.power = power;
		 this.make = make;
		 this.door = door;
		 this.price = price;
		 this.milage = milage;
	  }
	  
	  Car_ConstructorChaining (String name,String power,int make,int door,double price,double milage,String color){
		  this(name,power,make,door,price,milage);
		  this.color = color;
	  }
	  
	  Car_ConstructorChaining (String name,String power,int make,int door,double price,double milage,String color,String insurance){
		  this(name,power,make,door,price,milage,color);
		  this.insurance = insurance;
	  }
	  
	  Car_ConstructorChaining (String name,String power,int make,int door,double price,double milage,String color,String insurance,int seats){
		  this(name,power,make,door,price,milage,color,insurance);
		  this.seats = seats;
	  }
	  
	  // Blow method is used for to print the non-static members/var of given class.
	  public void displayCar() {
		  System.out.println(name);
		  System.out.println(power);
		  System.out.println(make);
		  System.out.println(door);
		  System.out.println(price);
		  System.out.println(milage);
		  System.out.println(color);
		  System.out.println(insurance);
		  System.out.println(seats);
	  }
	  
	  // Now Main method is created for to create an object.
	  public static void main(String[] args) {
		
		  Car_ConstructorChaining  c1 = new  Car_ConstructorChaining ();
		  c1.displayCar();
		  
		  System.out.println(" ");
		  
		  Car_ConstructorChaining  c2  = new  Car_ConstructorChaining ("Supra","575 bhp",1987,2,79.50,5.4);
		  c2.displayCar();
		  
		  System.out.println(" ");
		  
		  Car_ConstructorChaining c3 = new  Car_ConstructorChaining ("Defender","375 bhp",2024,5,1.2,6.7,"White","Yes",5);
		  c3.displayCar();
	}
	  
}

