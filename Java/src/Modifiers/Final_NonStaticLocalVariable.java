package Modifiers;

public class Final_NonStaticLocalVariable {

	public static void main(String[] args) {
		
		final int a = 10;
		System.out.println(a);
		
//		 a = 20;//CTE we can not reasign the value of final non-static local variable 
//		 System.out.println(a);
		
		final char ch ;
		ch = 'S';
		System.out.println("The character is: "+ ch);
		
//		ch = 'F'; //CTE here also can't reasign the value.
//		System.out.println("Another asssigned value is: "+ch);
	}
}
