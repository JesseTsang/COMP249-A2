package com.a2.books;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class EducationalBook extends Book
{
	private int editionNum;
	private String specialityField;
	
	/**
	 * Default constructor
	 */
	public EducationalBook()
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
	 * @param editionNum
	 * @param specialityField
	 */
	public EducationalBook(String title, double price, int numOfPages, long ISBN, int issueYear, String author, int editionNum, String specialityField)
	{
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author
		super(title, price, numOfPages, ISBN, issueYear, author);
		
		this.editionNum = editionNum;
		this.specialityField = specialityField;				
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param educationalBook
	 */
	public EducationalBook(EducationalBook educationalBook) 
	{
		this(educationalBook.getTitle(), educationalBook.getPrice(), educationalBook.getNumOfPages(), educationalBook.getISBN(),
				 educationalBook.getIssueYear(), educationalBook.getAuthor(), educationalBook.getEditionNum(), educationalBook.getSpecialityField());
	}

	public int getEditionNum() {
		return editionNum;
	}

	public void setEditionNum(int editionNum) {
		this.editionNum = editionNum;
	}

	public String getSpecialityField() {
		return specialityField;
	}

	public void setSpecialityField(String specialityField) {
		this.specialityField = specialityField;
	}
	
	/**
	 * toString method
	 */
	public String toString()
	{
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author, int editionNum, String specialityField
		String result = "This book's title is <<" + getTitle() + ">> and its price is " + getPrice() + " and it has " + getNumOfPages() + " pages. "
				+ "The ISBN is " + getISBN() + " and is issued in " + getIssueYear() + ". The author(s) is " + getAuthor() + ". "
				+ "The specialty field for this book is " + specialityField + " and its edition is " + editionNum + ".";
		
		return result;
	}
	
	/**
	 * Check if the object is null, same class, same attributes
	 * @param paperPublication
	 * @return
	 */
	public boolean equals(Object object)
	{
		if(!(object instanceof EducationalBook))
		{
			return false;			
		}
		else
		{
			EducationalBook bookObject = (EducationalBook)object;
			
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
			
			boolean isSameEdition = (bookObject.getEditionNum() == editionNum);
			boolean isSameSpeciality = (bookObject.getSpecialityField().equals(specialityField)); 
			
			if(!isSameTitle || !isSamePrice || !isSameNumOfPages || !isSameISBN || !isSameIssueYear || !isSameAuthor || !isSameEdition || !isSameSpeciality)
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
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author, int editionNum, String specialityField
		EducationalBook educationalBook1 = new EducationalBook("educationalTitle", 15.99, 600, 12345567, 2018, "John Doe", 8, "Self-Help");
		
		System.out.println("EducationalBook1 = " + educationalBook1.toString());
		
		EducationalBook educationalBook2 = new EducationalBook(educationalBook1);
		System.out.println("EducationalBook1 equal EducationalBook2? => " + educationalBook1.equals(educationalBook2));
		
		educationalBook1.setTitle("educationalTitle1.1");
		educationalBook1.setPrice(19.99);
		educationalBook1.setNumOfPages(700);
		educationalBook1.setISBN(135790246);
		educationalBook1.setIssueYear(2019);
		educationalBook1.setAuthor("Jane Doe");
		
		educationalBook1.setEditionNum(9);
		educationalBook1.setSpecialityField("Dentisty");
		
		System.out.println("EducationalBook1 updated = " + educationalBook1.toString());
		
		System.out.println("EducationalBook1 equal EducationalBook2? => " + educationalBook1.equals(educationalBook2));
	
		EducationalBook educationalBook3 = new EducationalBook();
		System.out.println("EducationalBook1 equal ChildrenBook3 (null EducationalBook())? => " + educationalBook1.equals(educationalBook3));
		
		EducationalBook educationalBook4 = null;
		System.out.println("EducationalBook1 equal ChildrenBook4 (null)? => " + educationalBook1.equals(educationalBook4));
	}
}