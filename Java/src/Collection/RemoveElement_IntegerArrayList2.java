package Collection;

import java.util.ArrayList;

// RemoveElement IntegerArrayList : Give one integer arrayList & remove element having given index.
// Index remove : a.remove(2);
// Element remove : a.remove((Integer)2);

public class RemoveElement_IntegerArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(14);
		a.add(7);
		a.add(8);
		a.add(2);
		a.add(8);
		a.add(9);
		a.add(2);
		a.add(22);
		a.add(8);
		a.add(2);
		a.add(68);
		
		System.out.println("Original list: " + a);
		
		// Remove the element by index (remove the element at index 2)
        a.remove(2);
        System.out.println("\nAfter removing element at index 2: " + a);
     
	   // Remove elements by value (remove all elements with value 2) 
        a.remove((Integer)2);
        System.out.println("\nAfter removing elements with value 2: " + a); // 2 element  removed i.e those elements are removed whose value is 2.
	}
}
