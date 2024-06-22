package Non_Static;

public class Mobile_Driver {
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.displayMobile();
		
		Mobile m2 = new Mobile("Iphone","Iphone 13 promax", 700000,"8GB","256GB","Light Green","4800mAh", "12Mp", "IOS 12","C");
		m2.displayBrand();
		m2.displayPrice();
		
		m2.displayMobile();
		
		m2.displayRam();
		m2.displayStorage();
		
		
	}

}
