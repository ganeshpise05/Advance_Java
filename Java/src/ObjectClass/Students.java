package ObjectClass;
 
public class Students {
	
	String name;
	String coll;
	int id;
	int age;
	char sec;
	char gen;
	String stream;
	long phno;
	
	public Students() {}
	
	public Students(String name,String coll,int id,int age,char sec,char gen,String stream,long phno)
	{
		super();
		this.name=name;
		this.coll=coll;
		this.id=id;
		this.age=age;
		this.sec=sec;
		this.gen=gen;
		this.stream=stream;
		this.phno=phno;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(coll);
		System.out.println(id);
		System.out.println(age);
		System.out.println(sec);
		System.out.println(gen);
		System.out.println(stream);
		System.out.println(phno);
	}
	
	public String toString()
	{
		return "[ Name: "+name+",coll: "+coll+",id: "+id+",age: "+age+",sec:"+sec+",gen: "+gen+",stream: "+stream+",phno: "+phno+" ]";
	}

	public boolean equal(Object o)
	{
		Students s = (Students)o;
		return this.name==s.name && this.coll==s.coll && this.id==s.id && this.age==s.age && this.sec==s.sec && this.gen==s.gen && this.stream==s.stream && this.phno==s.phno;
	}
	
	public int hashCode()
	{ 
		int hc = 0;
		hc = (int) (id+age+phno+sec+gen+name.hashCode()+coll.hashCode()+stream.hashCode());
		return  hc;
	}
}
