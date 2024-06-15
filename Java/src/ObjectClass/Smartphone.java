package ObjectClass;

public class Smartphone {
	
	String brand;
	String os;
	String processor;
	String RAM;
	String storage;
	String display;
	String displaysize;
	String camera;
	String battery;
	String connectivity;
	String sensor;
	
	public Smartphone() {}

	public Smartphone(String brand,String os,String processor,String RAM,String storage,String display,String displaysize,String camera,String battery,String connectivity,String sensor)
	{
		super();
		this.brand=brand;
		this.os=os;
		this.processor=processor;
		this.RAM=RAM;
		this.storage=storage;
		this.display=display;
		this.displaysize=displaysize;
		this.camera=camera;
		this.battery=battery;
		this.connectivity=connectivity;
		this.sensor=sensor;
	}
	
	public String toString()
	{
		return "[brand:"+brand+" ,os:"+os+" ,processor:"+processor+" ,RAM:"+RAM+" ,storrage:"+storage+" ,dispaly:"+display+" ,displaysize:"+displaysize+" ,camera:"+camera+" ,battery:"+battery+" ,connectivity:"+connectivity+" ,sensor:"+sensor+"]";
		
	}
	
	public boolean equal(Object o)
	{
		Smartphone s = (Smartphone)o;
		return this.brand==s.brand && this.os==s.os && this.processor==s.processor && this.RAM==s.RAM && this.storage==s.storage && this.display==s.display &&this.displaysize==s.displaysize && this.camera==s.camera && this.battery==s.battery && this.connectivity==s.connectivity && this.sensor==s.sensor ;
	}
	
	public int hashCode()
	{
		int hc = 0;
		hc = brand.hashCode()+os.hashCode()+processor.hashCode()+RAM.hashCode()+storage.hashCode()+display.hashCode()+displaysize.hashCode()+camera.hashCode()+battery.hashCode()+connectivity.hashCode()+sensor.hashCode();
		return hc;
	}
}
