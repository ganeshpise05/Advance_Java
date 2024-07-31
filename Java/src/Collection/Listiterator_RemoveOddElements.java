package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

// Remove odd Elements: Remove the all odd elements in given collection.

public class Listiterator_RemoveOddElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		System.out.println("original list: "+num);
		
		ListIterator<Integer> i = num.listIterator();
		
		while (i.hasNext()) {
			Integer in = i.next();
			if (in%2!=0) {
				i.remove();
			}
		}
		System.out.println("Updated List: "+num);
	}
}
