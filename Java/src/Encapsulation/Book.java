package Encapsulation;

public class Book {

	  // Private attributes
    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private String ISBN;
    private int numberOfPages;
    private double price;
    
    public Book() {}

    public Book(String title,String author,String publisher,int publicationYear,String ISBN,int numberOfPages,double price) {
    	this.title = title;
    	this.author = author;
    	this.publisher = publisher;
    	this.publicationYear = publicationYear;
    	this.ISBN = ISBN;
    	this.numberOfPages = numberOfPages;
    	this.price = price;
    }
    
    public String getTitle() {
		return title;
    }
    
    public String getAuthor() {
    	return author;
    }
    
    public String getPublisher() {
    	return publisher;
    }
    
    public int getPublicationYear() {
    	return publicationYear;
    }
    
    public String getIsbn() {
    	return ISBN;
    }
    
    public int getNumberOfPages() {
    	return numberOfPages;
    }
    
    public double getPrice() {
    	return price;
    }
}
