package Arrays;

import java.util.Arrays;

public class UniqueArrEle {
	
	public static void main(String[] args) {
		
		int[]a= {1,1,2,2,3,4,5};
		int[]ref=new int[a.length];
		ref=arrRef(a);
		
		System.out.println(Arrays.toString(ref));
		a=arrUniqueEle(a,ref);
		System.out.println(Arrays.toString(a));
		
	}
	public static int[] arrRef(int[] a) 
	{
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
		return ref;
	} 

	public static int[] arrUniqueEle(int[]a,int[]ref)
	{
		int[]uArr=new int[a.length-repCount(ref)];	
		
		for (int i = 0,j=0; i < ref.length; i++) {
			if(ref[i]!=-1) 
			{
				uArr[j]=a[i];
				j++;
			}
		}
		
		return uArr;
	}
	
	public static int repCount(int[]ref) 
	{
		int count=0;
		for (int i = 0; i < ref.length; i++) 
		{
			if(ref[i]==-1) 
			{
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
}
