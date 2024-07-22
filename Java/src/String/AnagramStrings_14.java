package String;

// Anagram Strings: Give an two strings check weather characters of string a is present in b.
// String a = "god" , String b = "dog" -----> Both are anagram.

public class AnagramStrings_14 {

	public static void main(String[] args) {
		
		String a = "god";
		String b = "dod";
      // System.out.println(isAnagram(a,b)); 
		isAnagram(a,b);
	}
	
	public static String isAnagram(String a , String b)
	{  
		if (a.length() == b.length()) {
			int  i = 0;
			for ( ; i < a.length(); i++) {
				int j = 0;
				for (; j < b.length(); j++) {
					if (a.charAt(i) == b.charAt(j)) {
						break;
					}
				}
			}
			if (i ==a.length()) {
				System.out.println("It is an anagram String. ");
			}
			else {
				System.out.println("It is not anagram String.");
			}
		} 
		else {
             System.out.println("It is not an anagram Because it has length not Same.");
		}
		return b;
	}
	 
}
