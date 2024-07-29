package Collection;

import java.util.ArrayList;

// Print Elements Stars with & Ends with given value.

public class PrintElements_StartEnds {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<>();
		a.add("Tomato");
		a.add("Potato");
		a.add("Chikku");
		a.add("Orange");
		a.add("Bringer");
		a.add("Onion");
		a.add("Lemon");
		a.add("Mango");
		a.add("Avacado");
		a.add("Banana");
		a.add("Chilli");
		
		for (Object object : a) {
		
			String s = ((String)object);
			char First = s.charAt(0);
			char Last = s.charAt(s.length()-1);
			
			if (First=='o'||Last=='O' || First=='O'||Last=='o') {
				System.out.println(s);
			}
		}
		System.out.println(a);
	}
}
