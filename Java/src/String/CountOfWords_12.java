package String;

// Count The Words: Give one string and count the words are present in given String.
// "Create your own Happiness" --------->  Count of words: 4
// 12: Count of words in given String.
public class CountOfWords_12 {

	public static void main(String[] args) {
		
		String s = "Create your own Happiness";
		System.out.println("Count of Words: "+countOfWords(s));
	}
	
	public static int countOfWords(String s)
	{
		// Calculate the number of words
		int wordCount = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				wordCount++;
			}
		}
		return wordCount;
	}
}
