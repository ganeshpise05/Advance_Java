package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Method1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
	    System.out.println(a);
	    
		 // Getting the iterator
        Iterator<Integer> i = a.iterator();
        
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		 
	}
}
