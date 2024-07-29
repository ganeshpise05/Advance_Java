package Collection;

import java.util.ArrayList;

// Merge two ArrayList: Give an two arraylist & merge these arrayList in one.

public class Merge_TwoArrayList {

	public static void main(String[] args) {

		ArrayList<Object> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		
		ArrayList<Object> b = new ArrayList<>();
		b.add(80);
		b.add(70);
		b.add(60);
		b.add(50);
		b.add(40);
		b.add(30);
		b.add(20);
		b.add(10);
		
		ArrayList<Object> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
        System.out.println(c);
	}
}
