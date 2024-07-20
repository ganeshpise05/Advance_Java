package String;

public class StringBuilder_Class {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Ganesh");
		
		StringBuilder s2 = s1.append(" Pise");
		
		System.out.println(s1);// Here are also old object was removed and new value assigned.
		System.out.println(s2);
		
		// it's used for when multiple operation perform you want .
		// StringBuilder And StringBuffer Classes are mutable/we can change the values of object.
	}
}
