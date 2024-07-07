package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class RefArr {
	//7th july,24
	public static void main(String[] args) {
		
		int[]a= {1,1,1,2,2,3,3,4,5,6};
		int[]ref= new int[a.length];
		int count;
		
		for (int i = 0; i < a.length; i++)
		{
			count=0;
			for (int j = i+1; j < a.length; j++)
			{
				 if(a[i]==a[j]) 
				 {
					ref[j]=-1;
					count++;
				 }
			} 
			
			if(ref[i]!=-1) 
			{
				ref[i]=count;
			}
		}
		
		System.out.println(Arrays.toString(ref));
	}

}
