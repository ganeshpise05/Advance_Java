package Practice;



abstract class SuperMan{
	 void show() {};
}

 interface SuperWoman {
	void show1();
}
class C  extends SuperMan implements SuperWoman{
	public void show() {
		System.out.println("Hello from C");
	}
	public void show1() {
		System.out.println("hellofrom show1");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		C obj = new C();
		
		
	}

}
