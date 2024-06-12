package ObjectClass;

public class Student extends Object {
	
	int id;
	String name;
	int rol;
	long phno;
	String col;
	double cgpa;
	int yop;
	
	public Student(){}
	
	public Student(int id,String name,int rol,long phno,String col,double cgpa,int yop)
	{
		super();
		this.id=id;
		this.name=name;
		this.rol=rol;
		this.phno=phno;
		this.col=col;
		this.cgpa=cgpa;
		this.yop=yop;
	}
	
	public String toString()
	{
        return "Student [id=" + id + ", name= " + name +", rol= "+ rol +",phno= "+phno +",cgpa= "+ cgpa + ",yop= "+yop+"]";
	}

}
