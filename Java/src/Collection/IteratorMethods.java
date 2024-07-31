package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Satara");
		s.add("Sangli");
		s.add("Ratnagiri");
		s.add("Lonere");
		s.add("Pune");
		s.add("Lonavla");
		System.out.println(s);
		
		Iterator <String> a = s.iterator();
	
		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
