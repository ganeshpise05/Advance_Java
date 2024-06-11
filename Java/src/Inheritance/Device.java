package Inheritance;

public class Device {
	
	String brand;
	double price;
	
	public Device()
	{
		
	}
	
	Device(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	public void displayDevice()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println("----------------------");
	}

}
