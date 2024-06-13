package ObjectClass;

public class Students_Driver {

	public static void main(String[] args) {
		 
		Students s1 = new Students("Ganesh","FTC Sangola",1242,21,'A','M',"Computer Science",8329988688l);
		s1.display();
		System.out.println("--------------------------------------------");
		
		Students s2 = new Students("Rocky","Sanjose Univercity",9866,29,'B','M',"CS & Engg",7219711611l);
		s2.display();
		System.out.println("--------------------------------------------");
		
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equal(s2));

	}
}
