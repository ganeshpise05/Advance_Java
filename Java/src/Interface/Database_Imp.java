package Interface;

public class Database_Imp implements Database {
	
	String username;
	String password;
	
	public Database_Imp() {}

	public Database_Imp(String username,String password)
	{
		super();
		this.username=username;
		this.password=password;
	}
	
	public void display()
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	public void connect()
	{
		System.out.println("You have to connected to database server of software.");
	}
	
	public void disconnect()
	{
		System.out.println("Server disconnected.");
	}
	
	public void executequery(String query)
	{
		 System.out.println( "Query Executed "+query);
	}

	@Override
	public void result() {
		 System.out.println("Upper statement shows result..");
		
	}
}
