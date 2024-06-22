package Constructor_Mothod_Chaining;

public class Car_Driver {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.displayCar();
		
		Car c2 = new Car(1242,"Ford","Mustang",1998,"Black",2,545,6.5,"Diesel",5,"V8","22/05/1999");	//id,brand,name,model,color,door,power,milage,ftype,airbag,enginetype,regdate
	    c2.id();
	    
	    c2.brand()	;
	    c2.name();
	    c2.model();
	    c2.color();
	    
	    c2.power();
	    c2.milage();
	}

}
