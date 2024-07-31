package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

// Listiterator_Remove Even Elements
public class Listiterator_RemoveEvenElements {

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
		num.add(11);
		System.out.println("Original List: "+num);
		
		ListIterator<Integer> i = num.listIterator();
		while (i.hasNext()) {
			Integer integer = i.next();
			if (integer%2==0) {
				i.remove();
			}
		}
		System.out.println("Updated list: "+num);
	}
}
