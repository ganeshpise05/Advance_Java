package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator2 {

	public static void main(String[] args) {
		
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Cherry");
		fruit.add("Chikku");
		fruit.add("Orange");
		fruit.add("Grapes");
		fruit.add("Pomegranate");
		fruit.add("Blueberry");
		
		ListIterator<String> s = fruit.listIterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		
		System.out.println(fruit);
	}
}
