package Collection;

public class List_Iterator {

	public static void main(String[] args) {
		
		System.out.println("ListIterator: Sub interface of Iterator i.e child class of Iterator.");
		System.out.println("  Methods   : 1> next() : It moves cursor from current object to Next object in collection.          ");
		System.out.println("              2> hasNext(): It checks the wethe next element pointed by cursor is present or not.             ");
		System.out.println("              3> previous() : It returns the element pointed by the cursor is present or not.       ");
		System.out.println("              4> hasPrevious(): It checks wether the previous element pointed by cursor is present or not.           ");
		System.out.println("              5> remove() :   It removes the current object pointed from the collection which is under iteration.        ");
		System.out.println("              6> addObject():   It's used to add new object into the collection under iteration.         ");
		System.out.println("              7> set() : Replace the element pointed by the cursor by new element.       ");
	}
}
