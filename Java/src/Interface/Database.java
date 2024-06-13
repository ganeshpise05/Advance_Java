package Interface;

public interface Database {
	
	int maxconne = 100;
	int maxtable = 20;
	
	void connect();
	void disconnect();
	void executequery(String query);
	void result();

}
