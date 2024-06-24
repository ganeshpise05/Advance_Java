package Modifiers;

//Protected
public class Test3 {

	protected Test3() {
		System.out.println("From no args constructor.");
	}
	
	protected static void test3() {
		 System.out.println("From protected staic method of class Test3.");
	}
	
	protected void test4() {
		System.out.println("From protected non static method of class test3.");
	}
	
	public static void main(String[] args) {
		
		Test3 t = new Test3();
		t.test3();
		t.test4();
	}
}
