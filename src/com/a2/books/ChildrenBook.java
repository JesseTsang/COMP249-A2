package com.a2.books;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class ChildrenBook extends Book 
{
	private int minAge;
	
	/**
	 * Default constructor
	 */
	public ChildrenBook()
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
	 * @param minAge
	 */
	public ChildrenBook(String title, double price, int numOfPages, long ISBN, int issueYear, String author, int minAge)
	{
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author
		super(title, price, numOfPages, ISBN, issueYear, author);
		
		this.minAge = minAge;		
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param childrenBook
	 */
	public ChildrenBook(ChildrenBook childrenBook)
	{
		this(childrenBook.getTitle(), childrenBook.getPrice(), childrenBook.getNumOfPages(), 
				childrenBook.getISBN(), childrenBook.getIssueYear(), childrenBook.getAuthor(), childrenBook.getMinAge());		
	}
	
	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	
	/**
	 * toString method.
	 */
	public String toString()
	{
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author
		String result = "This book's title is <<" + getTitle() + ">> and its price is " + getPrice() + " and it has " + getNumOfPages() + " pages. "
				+ "The ISBN is " + getISBN() + " and is issued in " + getIssueYear() + ". The author(s) is " + getAuthor() + ". "
				+ "The minmum age for this book is " + minAge + ".";
		
		return result;
	}
	
	/**
	 * Check if the object is null, same class, same attributes
	 * @param paperPublication
	 * @return
	 */
	public boolean equals(Object object)
	{
		if(!(object instanceof ChildrenBook))
		{
			return false;			
		}
		else
		{
			ChildrenBook bookObject = (ChildrenBook)object;
			
			boolean isTitleNull = (bookObject.getTitle() == null);
			
			if(isTitleNull)
			{
				return false;
			}
			
			boolean isSameTitle = bookObject.getTitle().equals(this.getTitle());
			boolean isSamePrice = (bookObject.getPrice() == this.getPrice()) ;
			boolean isSameNumOfPages = (bookObject.getNumOfPages() == this.getNumOfPages());
			
			boolean isSameISBN = (bookObject.getISBN() == this.getISBN());
			boolean isSameIssueYear = (bookObject.getIssueYear() == this.getIssueYear());
			boolean isSameAuthor = (bookObject.getAuthor().equals(this.getAuthor()));
			
			boolean isSameMinAge = (bookObject.getMinAge() == minAge); 
			
			if(!isSameTitle || !isSamePrice || !isSameNumOfPages || !isSameISBN || !isSameIssueYear || !isSameAuthor || !isSameMinAge)
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
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author, int minAge
		ChildrenBook childrenBook1 = new ChildrenBook("childrenTitle", 15.99, 600, 12345567, 2018, "John Doe", 8);
		
		System.out.println("ChildrenBook1 = " + childrenBook1.toString());
		
		ChildrenBook childrenBook2 = new ChildrenBook(childrenBook1);
		System.out.println("ChildrenBook1 equal ChildrenBook2? => " + childrenBook1.equals(childrenBook2));
		
		childrenBook1.setTitle("childrenTitle1.1");
		childrenBook1.setPrice(19.99);
		childrenBook1.setNumOfPages(700);
		childrenBook1.setISBN(135790246);
		childrenBook1.setIssueYear(2019);
		childrenBook1.setAuthor("Jane Doe");
		childrenBook1.setMinAge(6);
		
		System.out.println("ChildrenBook1 updated = " + childrenBook1.toString());
		
		System.out.println("ChildrenBook1 equal ChildrenBook2? => " + childrenBook1.equals(childrenBook2));
	
		ChildrenBook childrenBook3 = new ChildrenBook();
		System.out.println("ChildrenBook1 equal ChildrenBook3 (null ChildrenBook())? => " + childrenBook1.equals(childrenBook3));
		
		ChildrenBook childrenBook4 = null;
		System.out.println("ChildrenBook1 equal ChildrenBook4 (null)? => " + childrenBook1.equals(childrenBook4));
	}
}