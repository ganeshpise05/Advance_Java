package ObjectClass;

public class City extends Country {
	
	
	String cname;
	int area;
	String mayor;
	
	 City(String name,int population,String cname,int area,String mayor)
	{
		super(name,population);
		this.cname=cname;
		this.area=area;
		this.mayor=mayor;
	}
	
	public City() {
		 
	}

	public String toString() {
		//toString();
        return "City [cname=" + cname + ", area=" + area + ",mayor="+mayor+"]";
    }

}
