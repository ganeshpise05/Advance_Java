package Inheritance;

public class FatherSonDriver {
	
	public static void main(String[] args) {
		
		
		Son s1 = new Son();
		s1.smoking();
		s1.drinking();
		
//		Father f1 = new Father ();
//		f1.drinking();
		
	    Father f2 = new Son();
	    //f2.smoking(); it can not use properties of child class i.e child can use properties of father but father can't.
		f2.drinking();
	}

}
