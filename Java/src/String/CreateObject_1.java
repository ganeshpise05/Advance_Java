package String;

// Create Object: We have to two ways of creating object of string class.
// 1> Creating string object using String literal
// 2> Creating string object using new keyword and Constructor

public class CreateObject_1 {

	public static void main(String[] args) {
		
		String s1 = "Ganesh";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(" ");
		
		s1 = s1+"Pise";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(" ");
		
		s1 = s1+"Suresh Pise";
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}
}
