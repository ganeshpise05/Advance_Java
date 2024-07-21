package Interface;

public class Change_pass_username {

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
