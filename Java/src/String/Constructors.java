package String;

/* Constructors of String Class: Default/No Argument
 * String(String value)
 * String(StringBuffer buffer)
 * String(StringBuilder builder)
 * String(Char[] value)
 * String(Byte[] bytes)     */

public class Constructors {

	public static void main(String[] args) {
		
		String s1 = new String ("Funtya");
		System.out.println(s1);
		
		String s2 = new String ("Funtya");
		System.out.println(s2);
		
		System.out.println(" ");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(" ");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
