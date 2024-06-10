package decision_Statement;

//Example 1: Checking user login credentials
public class IfElseLogin {

	public static void main(String[] args) {
		
		 String username = "call_me_funtya";
		 String password = "Funtya@123";
		 
		 if (username=="call_me_funtya" && password=="Funtya@123") {
			    System.out.println("Login Successful !!!");
		}
		 else {
            System.out.println("Please enter valid username and password.");
		}
	}
}
