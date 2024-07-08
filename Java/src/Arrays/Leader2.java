package Arrays;

public class Leader2 {

	public static void main(String[] args) {
		
		int a [] = {1,2,4,3,5,2,8,6,33};
		int leader = a[a.length-1];
		System.out.println(leader);
		
		for (int i=a.length-2; i>=0 ; i--) {
			if (a[i]>=leader) {
				System.out.println(a[i]);
				a[i] = leader;
			//	leader = a[i];
			//	System.out.println(a[i]);
			}
		}
	}
}
