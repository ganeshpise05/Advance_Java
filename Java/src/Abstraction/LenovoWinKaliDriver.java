package Abstraction;

public class LenovoWinKaliDriver {
	
	public static void main(String[] args) {
		
		Lenovo l = new Windows();
		l.welcome("Windows");
		l.operatingSys();
		
		Lenovo l2 = new KaaliLinux();
		l2.welcome("Linux");
		l2.operatingSys();
	}

}
