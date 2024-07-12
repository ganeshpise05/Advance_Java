package Math;

public class GenerateOTP {

	private static int otp;
	
	public static void generateOTP()
	{
		int min = 1;
		int max = 10000;
		otp = (int) (Math.random() * (max-min+1)+max);
	}
	
	public static void main(String[] args) {
		
		generateOTP();
	    System.out.println("Generated OTP: " + otp);
	}
}
