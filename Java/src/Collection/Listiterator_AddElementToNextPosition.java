package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

// Add zero : Add zero element at next to the odd element in given collection.
// [10,11,12,13,15,18,17,19] -----> [10,11,0,12,13,0,15,0,18,17,0,19,0]

public class Listiterator_AddElementToNextPosition {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(15);
		num.add(18);
		num.add(17);
		num.add(19); 
		System.out.println(num);
		
		ListIterator<Integer> i = num.listIterator();
		while (i.hasNext()) {
			Integer in = i.next();
			if (in%2!=0) {
				i.add(0);
			}
		}
		System.out.println("Updated List: "+num);
	}
}
