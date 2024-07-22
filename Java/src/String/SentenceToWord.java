package String;

import java.util.Arrays;

// Convert Sentence to Word Array: Given one string and convert this string into a word array.
// "Be Remembered For Good" -------> [Be, Remembered, For, Good]

public class SentenceToWord {

    public static void main(String[] args) {
        String s = "Be Remembered For Good";
        String[] words = stringToArray(s);
        System.out.println(Arrays.toString(words));
    }

    public static String[] stringToArray(String s) {
        // Calculate the number of words
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store words
        String[] ans = new String[wordCount];
        
        int arrayIndex = 0;
        String temp = "";
        
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                ans[arrayIndex] = temp;
                arrayIndex++;
                temp = "";
            } else {
                temp += s.charAt(j);
            }
        }
        
        // Adding the last word
        ans[arrayIndex] = temp;
        
        return ans;
    }
}

