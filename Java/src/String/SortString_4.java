package String;

// Sort Char of String: Give an one string and sort the elements of String.
// "adebfc" ---------> abcdef

public class SortString_4 {

	public static void main(String[] args) {
		
		String s = "adebfc";
		System.out.println( bubbleSort(s));
		 
	}
	public static char[] bubbleSort(String a)
	{
		char [] ch =  a.toCharArray();
		
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = 0; j < ch.length-1-i; j++) {
				if (ch[j]>ch[j+1]) {
					int temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = (char) temp;
				}
			}
		}
		return ch;
		 
	}
}
