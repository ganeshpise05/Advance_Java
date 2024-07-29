package Collection;

import java.util.ArrayList;

// Find/Print Index(i) Elements: Give an ArrayList & find elements at index(i) by using for each loop.

public class Find_IndexElements {

		public static void main(String[] args) {
			
			ArrayList<Object> a = new ArrayList<>();
			a.add(10);
			a.add("Funtya");
			a.add(true);
			a.add(123.45);
			a.add(834897865);
			
			for (int i = 0 ; i< a.size();i++) {
				System.out.println(a.get((int) i));
			} 
 	}
}
