package Interface;

public class Database_Driver {

	public static void main(String[] args) {
		 
		Database d1 = new Database_Imp();
		d1.connect();
		d1.executequery("select * from emp where ename = scott");
		d1.result();
		d1.disconnect();
		
		System.out.println(Database.maxconne);
		System.out.println(Database.maxtable);
		
		Database_Imp i1 = new Database_Imp("Scott","Tiger");
		i1.display();
		i1.connect();
		i1.executequery("select count(sal) from emp group by sal;");
		i1.result();
		
	}

}
