package Inheritance;

public class DevicePhoneDriver {

	public static void main(String[] args) {
		
		SmartPhone s1 = new SmartPhone("Samsung S22",120000,"Snapdragon","48MP","8GB");
		s1.displayPhone();
		s1.displayDevice();
		
		Device d1 = s1;
		d1.displayDevice();
	}
}
