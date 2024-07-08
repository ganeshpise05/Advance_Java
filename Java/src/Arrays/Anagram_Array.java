package Arrays;

public class Anagram_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {5,3,2,6,1,7,4,5};
		
		if (a.length == b.length) {
			
			int i;
			for (i = 0; i < a.length; i++) {
				
				int j;
				for (j = 0; j < b.length; j++) {
					
					if ( a[i] == b[j]) {
						break;
					}
				}
				if (j == b.length) {
					break;
				}
			}
			if (i == a.length) {
				System.out.println("It is an Anagram array.");
			} else {
               System.out.println("It's not Anagram array.");
			}
		} 
		
		else {
          System.out.println("Length was not same i.e It's not Anagram Array.");
		}
	}
}
