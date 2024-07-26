package Interface;

public interface Payment {
	
	int maxamt = 10000;
	int minamt = 1000;
	
	void processpay(int amt);
	void refund();
	void generatereceipt();

}
