package Arrays;

public class MinSecond_Value {

	public static void main(String[] args) {
		
		int a[] = {1,-2,4,5,-22,-5,7,8,4,-12,-45};
		
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				secMin = min;
				min = a[i];
			}
			
			else if (secMin<a[i] && min!=secMin) {
				secMin =a[i];
			}
		}
		System.out.println("First minimum value is: "+min);
		System.out.println("Second minimum value is: "+secMin);
	}
}
