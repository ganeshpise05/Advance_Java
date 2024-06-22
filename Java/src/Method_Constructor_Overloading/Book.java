package Method_Constructor_Overloading;

public class Book {
 

	    private String title;
	    private String author;
	    private double price;

	    // Constructor with no parameters
	    public Book() {
	        this.title = "Unknown";
	        this.author = "Unknown";
	        this.price = 0.0;
	    }

	    // Constructor with one parameter
	    public Book(String title) {
	        this.title = title;
	        this.author = "Unknown";
	        this.price = 0.0;
	    }

	    // Constructor with two parameters
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.price = 0.0;
	    }

	    // Constructor with three parameters
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    public void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: $" + price);
	    }

	    public static void main(String[] args) {
	        Book book1 = new Book();
	        Book book2 = new Book("Java Programming");
	        Book book3 = new Book("Java Programming", "John Doe");
	        Book book4 = new Book("Java Programming", "John Doe", 29.99);

	        book1.display();
	        System.out.println();
	        book2.display();
	        System.out.println();
	        book3.display();
	        System.out.println();
	        book4.display();
	    }
 
}
