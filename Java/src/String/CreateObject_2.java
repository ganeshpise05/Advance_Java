package String;

//2> Creating string object using new keyword and Constructor

public class CreateObject_2 {

	public static void main(String[] args) {
		
		String a = new String("Ganesh");
		System.out.println(a);
		System.out.println(a.hashCode());
		
		System.out.println(" ");
		
		String b = new String("Ganesh");
		System.out.println(b);
		System.out.println(b.hashCode());
		
		System.out.println(" ");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
