package Non_Static;

public class Mobile {
	
	//Non-Staic Variables
	
	String brand="Vivo";//Non-static initializer
	String name;
	int price;
	String ram;
	String storage;
	String color;
	String battery;
	String camera;
	String processor="Snapdragon 885";//Non-static initializer
	String charger;
	
	Mobile(){
		
	}
	
    Mobile(String brand,String name,int price,String ram,String storage,String color,String battery,String camera,String processor,String charger){
		
    	this.brand=brand;
    	this.name=name;
    	this.price=price;
    	this.ram=ram;
    	this.storage=storage;
    	this.color=color;
    	this.battery=battery;
    	this.camera=camera;
    	this.processor=processor;
    	this.charger=charger;
	}
    
    public void displayMobile() {
           
    	System.out.println("         "+brand);
    	System.out.println(name);
    	System.out.println(price);
    	System.out.println(ram);
    	System.out.println(storage);
    	System.out.println(color);
    	System.out.println(battery);
    	System.out.println(camera);
    	System.out.println("         "+processor);
    	System.out.println(charger);
    	 System.out.println("---------------------------------");
    }
    
    //Non-Static methods
    public void displayBrand() {
    	System.out.println("The brand of given mobile is: "+brand);
    }
    
    public void displayName() {
    	System.out.println("Name of cellphone is: "+name);
    }
    
    public void displayPrice() {
    	System.out.println("Price is: "+price);
    }
    
    public void displayRam() {
    	System.out.println("Ram of mobile is: "+ram );
    }
    
    public void displayStorage() {
    	System.out.println("Storage is: "+storage);
    }

}
