package com.a2.books;

import com.a2.paperpublication.PaperPublication;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class Book extends PaperPublication
{
	private long ISBN;
	private int issueYear;
	private String author;
	
	/**
	 * Default constructor
	 */
	public Book()
	{
		super();		
	}
	
	/**
	 * Parameterized constructor
	 * 
	 * @param title
	 * @param price
	 * @param numOfPages
	 * @param ISBN
	 * @param issueYear
	 * @param author
	 */
	public Book(String title, double price, int numOfPages, long ISBN, int issueYear, String author)
	{
		super(title, price, numOfPages); //String title, double price, int numOfPages
		
		this.ISBN = ISBN;
		this.issueYear = issueYear;
		this.author = author;		
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param book
	 */
	public Book(Book book)
	{
		this(book.getTitle(), book.getPrice(), book.getNumOfPages(), book.getISBN(), book.getIssueYear(), book.getAuthor());		
	}
	
	protected long getISBN() {
		return ISBN;
	}

	protected void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	protected int getIssueYear() {
		return issueYear;
	}

	protected void setIssueYear(int issueYear) {
		this.issueYear = issueYear;
	}

	protected String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * toString method.
	 */
	public String toString()
	{
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author
		String result = "This book's title is <<" + getTitle() + ">> and its price is " + getPrice() + " and it has " + getNumOfPages() + " pages. "
				+ "The ISBN is " + ISBN + " and is issued in " + issueYear + ". The author(s) is " + author + ".";
		
		return result;
	}
	
	/**
	 * Check if the object is null, same class, same attributes
	 * @param paperPublication
	 * @return
	 */
	public boolean equals(Object object)
	{
		if(!(object instanceof Book))
		{
			return false;			
		}
		else
		{
			Book bookObject = (Book)object;
			
			boolean isTitleNull = (bookObject.getTitle() == null);
			
			if(isTitleNull)
			{
				return false;
			}
			
			boolean isSameTitle = bookObject.getTitle().equals(this.getTitle());
			boolean isSamePrice = (bookObject.getPrice() == this.getPrice()) ;
			boolean isSameNumOfPages = (bookObject.getNumOfPages() == this.getNumOfPages());
			
			boolean isSameISBN = (bookObject.getISBN() == ISBN);
			boolean isSameIssueYear = (bookObject.getIssueYear() == issueYear);
			boolean isSameAuthor = (bookObject.getAuthor().equals(author));
			
			if(!isSameTitle || !isSamePrice || !isSameNumOfPages || !isSameISBN || !isSameIssueYear || !isSameAuthor)
			{
				return false;				
			}
			
			return true;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Book book1 = new Book("BookTitle", 15.99, 600, 12345567, 2018, "John Doe");
		
		System.out.println("book1 = " + book1.toString());
		
		Book book2 = new Book(book1);
		System.out.println("Book1 equal book2? => " + book1.equals(book2));
			
		book1.setTitle("BookTitle1.1");
		book1.setPrice(19.99);
		book1.setNumOfPages(700);
		book1.setISBN(987654321);
		book1.setIssueYear(2019);
		book1.setAuthor("Jane Doe");
		
		System.out.println("Book1 updated = " + book1.toString());
		
		System.out.println("Book1 equal book2? => " + book1.equals(book2));
		
		Book book3 = new Book();
		System.out.println("Book1 equal book3(null Book())? => " + book1.equals(book3));
		
		Book book4 = null;
		System.out.println("Book1 equal book4(null)? => " + book1.equals(book4));
	}
}
