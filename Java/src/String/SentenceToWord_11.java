package String;

import java.util.Arrays;

// Convert Sentence to Word Array: Give and one string and convert this string into word array.
// "Be Remembered For Good" -------> [Be,Remembered,For,Good]

public class SentenceToWord_11 {

	public static void main(String[] args) {
		
		String s = "Be Remembered For Good";
		String[] words = stringToArray(s);
        System.out.println(Arrays.toString(words));
	}
	
	
	public static String[] stringToArray(String s)
	{
		// Calculate the number of words
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }

        System.out.println(wordCount);
        
        // Create an array to store words
		String [] ans  = new String [wordCount];
		
			int j = 0;
			String temp = " ";
			
			for (int  i = 0; i < s.length(); i++) {
				
				if (s.charAt(i)== ' ' ) {
					ans[j] = temp;
					j++;
					temp = ""; 
				}
				else {
					temp+=s.charAt(i);
				}
			}
			ans[j] = temp; 
		    return ans;
		
	}
}
