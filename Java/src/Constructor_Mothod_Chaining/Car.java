package Constructor_Mothod_Chaining;

public class Car {
	
	int id;
	String brand;
	String name;
	int model;
	String color;
	int door;
	int power;
	double milage;
	String ftype;
	int airbag;
	String enginetype;
	String regdate;
	
	Car(){
		System.out.println("From no args constructor of method chaining.");
		System.out.println("       ");
	}
	
	Car(int id,String brand,String name,int model,String color,int door,int power,double milage,String ftype,int airbag,String enginetype,String regdate){
		this.id=id;
		this.brand=brand;
		this.name=name;
		this.model=model;
		this.color=color;
		this.door=door;
		this.power=power;
		this.milage=milage;
		this.ftype=ftype;
		this.airbag=airbag;
		this.enginetype=enginetype;
		this.regdate=regdate;
	}
	
	public void displayCar() {
		System.out.println(id);
		System.out.println(brand);
		System.out.println(name);
		System.out.println(model);
		System.out.println(color);
		System.out.println(door);
		System.out.println(power);
		System.out.println(milage);
		System.out.println(ftype);
		System.out.println(airbag);
		System.out.println(enginetype);
		System.out.println(regdate);
		System.out.println("------------------------------");
	}

    //non-static methods are written in below.
	
	public void id() {
		System.out.println("The id of given car: "+id);
	}
	
	public void brand() {
		System.out.println("Brand od car: "+brand);
	}
	
	public void power() {
		System.out.println("Brand od car: "+power+"Bhp");
	}
	
	public void name() {
		System.out.println("Name of the car is: "+name);
	}
	
	public void model() {
		System.out.println("Model of year: "+model);
	}
	
	public void color() {
		System.out.println("The color of car is: "+color);
	}
	
	public void door() {
		System.out.println("Doors of car is: "+ door);
	}
	
	public void milage() {
		System.out.println("Milage= "+milage+"Kmpl");
	}
	
	public void ftype() {
		System.out.println("Fuel type of car is: "+ftype);
	}
}
