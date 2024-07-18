package String;

import java.util.Arrays;

// String to Word Array: Give one String and convert it into word array.
// "Be Remembered for Good" ---------> [Be,Remembered,For,Good]

public class StringToWordArray_13 {

	public static void main(String[] args) {
		
		String s = "Be Remembered For Good";
		String [] words = stringToArray(s);
		System.out.println(Arrays.toString(words));
	}

	public static String[] stringToArray(String s) {
		 
		// First count the words in given array.
		int wordCount = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				wordCount++;
			}
		}
		//System.out.println(wordCount);
		
		// Creating array to store the words.
		String[] wordArray  = new String[wordCount];	
		int i = 0;
		String temp = " ";
		for (int j = 0; j < s.length(); j++) {
			
			if (s.charAt(j) == ' ') {
				wordArray[i]=temp;
				i++;
				temp = " ";
			} else {
                temp+=s.charAt(j);
			}
		}
		wordArray[i] = temp;
		return wordArray;
	}
}
