package String;

import java.util.Arrays;

// Q.2> Extract String To Array: Give one String and convert the characters into the Array.
// String s = "John Machcharty" --------> ans[] = [J,o,h,n,M,a,c,h,c,h,a,r,t,y]

public class StringToArray_2 {

	public static void main(String[] args) {
		
		String s = "John Machcharty";
		char [] array = charToArray(s);
		System.out.println(Arrays.toString(array));
	}
	
	public static char[] charToArray(String a)
	{
		char ch [] = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			 
			ch[i] = a.charAt(i);
		}
		return ch;
	}
}
