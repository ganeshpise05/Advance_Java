package Method_Constructor_Overloading;

public class Area_MethodOverloading {
	

    // Method to calculate the area of a square
	public double area(double side) {
		return side*side;
	}
	
	// Overloaded method to calculate the area of a rectangle
	public double area(double height,double width) {
		return height*width;
	}
	
	  // Method to calculate the volume of a cube //volume
    public double are(double height) {
        return height *height * height;
    }
    
    // Overloaded method to calculate the volume of a rectangular box  //volome 
    public double area(double length, double width, double height) {
        return length * width * height;
    }
	
    public static void main(String[] args) {
    	Area_MethodOverloading  area = new Area_MethodOverloading();

    	System.out.println("Area of square: " + area.area(5));
        System.out.println("Area of rectangle: " + area.area(5.1, 1.0));
        System.out.println("Volume of cube: " + area.are(1.2));
        System.out.println("Volume of box: " + area.area(3, 4, 5));
    }
}
