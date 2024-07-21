package Exception;

public class Test4 {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		try {
			for(int i=0;i<6;i++) {
				System.out.println(a[i]+"");
			}
			throw new NullPointerException("Hello");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			 System.out.println("Exceptonm");
			 
		}
		catch (Exception e) {
			 System.out.println("exsdnsn");
		}
	}

}
