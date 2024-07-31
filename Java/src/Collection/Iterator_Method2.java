package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Method2 {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Funtya");
		s.add("Rayesh");
		s.add("Ajay");
		s.add("Ganesh");
		s.add("Sham");
		s.add("Abhijit");
		s.add("Sushant");
		
		System.out.println(s);
		
		// Getting the iterator
        Iterator<String> i = s.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.hasNext());  
	}
}
