package Arrays;


// Leader Array: Give an array if right side element is less than given element.
// last element always leader :10 another are 8,5,9

public class Leader {

	public static void main(String[] args) {
		
		int a [] = {9,2,5,3,2,8,6,10};
		int leader = a[a.length-1];
		System.out.println(leader);
		
		for (int i = a.length-2; i>=0 ; i--) {
			if (a[i]>=leader) {
				System.out.println(a[i]);
				leader = a[i];
			}
		}
	}
}
