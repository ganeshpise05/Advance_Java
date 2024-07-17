package String;

import java.util.Iterator;

// Insert Element: Give an one string and insert the elements in String from given index.

public class InsertElement_9 {

	public static void main(String[] args) {
		
		String a = "abcdjklmn";
		String b = "efghi";
		
		int  ans = a.length() + b.length();
		char[] c = new char[ans];
		int index = 4;
		
		 // Copy characters from string a to combined up to index
        int i = 0;
        for (; i < index; i++) {
            c[i] = a.charAt(i);
        }
        
        // Insert characters from string b into combined at index
        int j = 0;
        for (; j < b.length(); j++) {
            c[i + j] = b.charAt(j);
        }
        
        // Append remaining characters from string a to combined
        int k = 0;
        for (; i < a.length(); i++, k++) {
            c[index + j + k] = a.charAt(i);
        }
        
        // Convert character array to string
        String ans2 = new String(c);
        
        System.out.println(ans2); 
	}
}
