package Collection;

import java.util.ArrayList;

// Merge two ArrayList from given Index: Give two Arraylists & merge second Arraylist in first one from given index.

public class Merge_TwoArrFromGivenIndex {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<>();
		a.add("Apple");
		a.add("Mango");
		a.add("Banana");
		a.add("Cherry");
		a.add("Grapes");
		a.add("Orange");
		
		ArrayList<Object> b = new ArrayList<>();
		b.add("Potato");
		b.add("Tomato");
		b.add("Onion");
		b.add("Brinjer");
		b.add("Cabbage");
		b.add("Radish");
		
		ArrayList<Object> c = new ArrayList<>();
//		c.addAll(a);
//		c.addAll(b);
//		System.out.println(c);
//		System.out.println(" ");
		
		c.addAll(2, b);  // Adding elements from second index.
		System.out.println(c); 
	}
}
