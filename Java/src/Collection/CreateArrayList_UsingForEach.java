package Collection;

import java.util.ArrayList; 

// Create ArrayList : By using the for each loop.

public class CreateArrayList_UsingForEach {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(10);
		a.add("Funtya");
		a.add(true);
		a.add(123.45);
		a.add(834897865);
		
		System.out.println(a);
	}
}
