package ObjectClass;

public class Country {
        
	String name;
	int population;
	
	public Country() {}
	
	 Country(String name,int population)
	{
		this.name=name;
		this.population=population;
	}
	
	public String toString() {
        return "Country [name=" + name + ", population=" + population + "]";
    }
}
