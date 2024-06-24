package Modifiers;

//Private 
public class Test1 {
	
	private static int a = 33;
	private static char ch = 'F';
	
	private Test1() {
		System.out.println("From no argument method of private class Test1.");
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(ch);
	}

}
