package Interface;

public interface User {
	
	    // Attributes
	    int maxloginattempt = 3;
	    int session = 30; // minutes

	    // Methods
	    boolean login(String username, String password);
	    void logout();
	    boolean register(String username, String password, String email);
	    void emailid(String email);
	    boolean resetPassword(String email);
	     boolean changePassword(String username,String password,String newpassword);
             	
}
