package Inheritance;

public class BankAccDriver {

	public static void main(String[] args) {
		
		SavingAcco s1 = new SavingAcco(500000,1234567890l,4.5,20000);
		s1.displayAcc();
		s1.displayBank();
		
		Bank b1 = s1 ;//upcasting
        b1.displayBank();
	}

}
