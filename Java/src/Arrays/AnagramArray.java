package Arrays;

public class AnagramArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = {9,1,8,2,7,4,6,5,2};
		
		if (a.length == b.length) {
			int i;
			for ( i = 0; i < a.length; i++) {
				int j ;
				for ( j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						break;
					} 
				}
				if (j == b.length) {
					break;
				}
			}
			if (i == a.length) {
				System.out.println("It's Anagram array.");
			}
			else {
				System.out.println("Not Anagram array.");
			}
		}
		else {
			System.out.println("Length was not same i.e it's not Anagram array.");
		}
	}
}
