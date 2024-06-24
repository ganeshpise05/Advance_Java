package Modifiers;

//Default
public class Test2 {
	
	static double d = 3.14;
	
	Test2(){
		System.out.println("From no args constructor.");
	}
	static void test() {
		System.out.println("From default static method of class Test2");
	}
	
	void test2() {
		System.out.println("From default non static method of class Test2. ");
	}
	
	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		t1.test();
		t1.test2();
	}

}
