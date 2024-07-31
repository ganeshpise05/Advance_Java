package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(20);
		num.add(30);
		num.add(50);
		num.add(10);
		num.add(90);
		System.out.println(num);
		
		ListIterator<Integer> i =  num.listIterator(); 
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.previous());
		System.out.println(i.hasPrevious());
		System.out.println(i.previous());
		System.out.println(i.previous());
	}
}
