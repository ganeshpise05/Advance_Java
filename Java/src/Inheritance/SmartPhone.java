package Inheritance;

public class SmartPhone extends Device {
	
	String os;
	String camera;
	String ram;
	
	public SmartPhone() {}
	
	SmartPhone(String brand,double price,String os,String camera,String ram)
	{
		super(brand,price);
		this.os=os;
		this.camera=camera;
		this.ram=ram;
	}
	
	public void displayPhone()
	{
		System.out.println(os);
		System.out.println(camera);
		System.out.println(ram);
	}

}
