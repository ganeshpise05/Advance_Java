package Encapsulation;

public class BookDriver {

	public static void main(String[] args) {
		
		Book b1 = new Book();// For no argument constructor.
		
		// Creating getter methods for Book B1
	     System.out.println("\nBook 1:");
	     System.out.println("Title: "+b1.getTitle());
	     
	   Book b2 = new Book("Effective Java","Joshua Bloch","Addison-Wesley",2018,"978-0134685991",416,135.5);
	   
	   // Creating getter methods for Book B2
	   System.out.println("\nBook 2: ");
	   System.out.println("Title: "+b2.getTitle());
	   System.out.println("Author: "+b2.getAuthor());
	   System.out.println("Publisher: "+b2.getPublisher());
	   System.out.println("Publication Year: "+b2.getPublicationYear());
	   System.out.println("ISBN no: "+b2.getIsbn());
	   System.out.println("Number of Pages: "+b2.getNumberOfPages());
	   System.out.println("Price: "+b2.getPrice());
	}
}

// String title,String author,String publisher,int publicationYear,String ISBN,int numberOfPages,double price