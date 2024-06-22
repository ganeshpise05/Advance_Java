package Non_Static;

public class Bottle_Initialize {
	
	String brand = "Milton";
	int price;
	String color;
	int capacity;
	String material;
	
	Bottle_Initialize(){
		
	}
	
    Bottle_Initialize(String brand,int price,String color,int capacity,String material){
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.capacity=capacity;
		this.material=material;
	}
    
    public void displayBottle() {
    	System.out.println(brand);
    	System.out.println(price);
    	System.out.println(color);
    	System.out.println(capacity);
    	System.out.println(material);
    }
    
    
	
	

}
