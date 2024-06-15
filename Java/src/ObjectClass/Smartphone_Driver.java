package ObjectClass;

public class Smartphone_Driver {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("Apple","iOS","8GB","128GB","Amoled","5.5 inch","12MP","4200mAH","Bluetooth","Face lock","abs");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		
		System.out.println("-----------------------------------------------------------------------------");

		Smartphone s2 = new Smartphone();
		System.out.println(s2);
		System.out.println(s2.toString());
		//System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equal(s2));
	}

}
