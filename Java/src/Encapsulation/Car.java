package Encapsulation;

public class Car {

	private String make;
    private String model;
    private int year;
    private String color;
    private String licensePlate;
    private int milage;
    private String fuel;
    
    public Car() {}
    
    public Car(String make,String model,int year,String color,String licensePlate,int milage,String fuel) {
    	this.make = make;
    	this.model = model;
    	this.year = year;
    	this.color = color;
    	this.licensePlate = licensePlate;
    	this.milage = milage;
    	this.fuel = fuel;
    }
    
    public String getMake() {
    	return make;
    }
    public void setMake(String make) {
    	this.make = make;
    }
    
    public String getModel() {
    	return model;
    }
    public void setModel(String model) {
    	this.model = model;
    }
    
    public int year() {
    	return year;
    }
    public void setYear(int year) {
    	this.year = year;
    }
    
    public String getColor() {
    	return color;
    }
    public void setColor(String color) {
    	this.color = color;
    } 
    
    public String getLicensePlate() {
    	return licensePlate;
    }
    
    public int getMilage() {
    	return milage;
    }
    
    public String getFuel() {
    	return fuel;
    }
}
