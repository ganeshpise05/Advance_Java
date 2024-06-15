package Interface;

public class Login implements User {
	
	private int loginattempts;

	@Override
	public boolean login(String username, String password) {
		 if (loginattempts >= maxloginattempt) {
	            System.out.println("Account locked due to too many failed login attempts.");
	            return false;
	        }
	        // Dummy authentication logic
	        if ("user".equals(username) && "pass".equals(password)) {
	            loginattempts = 0; // Reset login attempts on successful login
	            System.out.println("Login successful.");
	            return true;
	        } else {
	            loginattempts++;
	            System.out.println("Invalid credentials. Attempt " + loginattempts);
	            return false;
	        }
	}

	@Override
	public void logout() {
		 System.out.println("You have Logged Out!!!");
	}

	@Override
	public boolean register(String username, String password, String email) {
		System.out.println("User registered Successfully!!");
		return false;
	}

	@Override	public void emailid(String email) {
		System.out.println("You have to entered email id is: "+email);
	}

	@Override
	public boolean resetPassword(String email) { 
	    System.out.println("Password reset link sent to " + email);
		return true;
	}

	@Override
	public boolean changePassword(String username,String password,String newpassword)
	{
		if ("user".equals(username) && "pass".equals(password) && "newpassword".equals(newpassword)) {
			  System.out.println("Your password changed succesfully. New password is:"+newpassword);
			  return true;
		} else {
            System.out.println("Please enter a valid username and password ");
            return false;
		}
		
	}
	
	 

}
