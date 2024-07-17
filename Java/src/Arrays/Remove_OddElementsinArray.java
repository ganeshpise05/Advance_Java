package Arrays;

import java.util.Arrays;

//Give an a one array count the even elements and remove from the array.[1,2,3,4,5]  ---->  [1,3,5]
public class Remove_OddElementsinArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7};
		int [] ans = new int [a.length - countOfEvenElements(a)];
		
		for (int i = 0,j = 0; i < a.length; i++)
		{
			
			if (a[i]%2 !=0) 
			
			{
				
				ans[j] = a[i];
				j++;
			}
		}
		
		System.out.println("Sorted array after removing even elements: "+Arrays.toString(ans));
		
	}


  public static int countOfEvenElements(int[] a) {
	
	 int count = 0;
	 for (int  i = 0; i < a.length; i++) {
		
		 if (a[i]%2==0) {
			count ++;
		}
	}
	return count;	 
  }

}
