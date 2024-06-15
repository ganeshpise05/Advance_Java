package Interface;

public class UserSignup_Driver {

	public static void main(String[] args) {
		 User u1 = new Login();
		 u1.register("ganeshpise05","Ganesh@2205", "piseganesh2205@gmail.com");
		 u1.emailid("piseganesh2205@gmail.com");
//		 u1.login("ganeshpise05", "Ganesh2205");
//		 u1.login("ganeshpise05", "Ganesh@2505");
//		 u1.login("ganeshpise05","Ganesh@2205");
//		 u1.login("ganeshpise05","Ganesh@2205");
		 u1.login("ganeshpise05","Ganesh@2205");
		 u1.resetPassword("piseganesh2205@gmail.com");
		 u1.logout();
		 u1.changePassword("ganeshpise05", "Ganesh@2205", "Funtya@123");
	}

}
