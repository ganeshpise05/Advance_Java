package String;

public class StringBuilder_Methods {

	public static void main(String[] args) {
		
		// 1: append(): Adds a string representation of the argument to the sequence.
		StringBuilder s1 = new StringBuilder("Ganesh");
		s1.append(" Pise");
		System.out.println("append(): "+s1);
		
		System.out.println(" ");
		
		//2 : insert(): Inserts a string or character sequence at the specified position.
		StringBuilder s2 = new StringBuilder("Ganesh");
		s2.insert(6, "Pise");
		System.out.println("insert(): "+s2);
		
		System.out.println(" ");
		
		// 3: delete(): Removes the characters in a substring of the sequence.
		StringBuilder s3 = new StringBuilder("Rayesh");
		s3.delete(2, 5);
		System.out.println("delete(): "+s3);
		
		System.out.println(" ");
		
		// 4: deleteCharAt(): Removes the character at the specified position.
		StringBuilder s4 = new StringBuilder("Asthetic");
		s4.deleteCharAt(0);
		System.out.println("deleteCharAt(): "+s4);
		
		System.out.println(" ");
		
		// 5: replace(): Replaces the characters in a substring with characters in the specified String.
		StringBuilder s5 = new StringBuilder("Hello Funtya");
		s5.replace(6, 12, "Java");
		System.out.println("replace(): "+s5);
		
		System.out.println(" ");
		
		// 6: substring(): Returns a new string that contains a subsequence of characters currently contained in this character sequence.
		StringBuilder s6 = new StringBuilder("Hello Rayesh");
		String sub = s6.substring(6, 12);
		System.out.println("substring(): "+sub);
		
		System.out.println(" ");
		
		// 7: reverse(): Reverses the sequence of characters.
		StringBuilder s7 = new StringBuilder("Rayesh");
		StringBuilder rev = s7.reverse();
		System.out.println("reverse(): "+rev);
		
		System.out.println(" ");
		
		// 8: length(): Returns the length (number of characters).
		StringBuilder s8 = new StringBuilder("Hello Ajay");
		int length = s8.length();
		System.out.println("length(): "+length);
	}
}

