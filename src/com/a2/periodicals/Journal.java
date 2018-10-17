package com.a2.periodicals;

import com.a2.paperpublication.PaperPublication;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class Journal extends PaperPublication
{
	private int issueNum;
	private String specialityField;
	
	/**
	 * Default constructor
	 */
	public Journal()
	{
		super();
	}
	
	/**
	 * Parameterized constructor
	 * 
	 * @param title
	 * @param price
	 * @param numOfPages
	 * @param issueNum
	 * @param specialityField
	 */
	public Journal(String title, double price, int numOfPages, int issueNum, String specialityField)
	{
		//String title, double price, int numOfPages
		super(title, price, numOfPages);
		
		this.issueNum = issueNum;
		this.specialityField = specialityField;		
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param journal
	 */
	public Journal(Journal journal)
	{
		this(journal.getTitle(), journal.getPrice(), journal.getNumOfPages(), journal.getIssueNum(), journal.getSpecialityField());		
	}

	public int getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}

	public String getSpecialityField() {
		return specialityField;
	}

	public void setSpecialityField(String specialityField) {
		this.specialityField = specialityField;
	}
	
	/**
	 * toString method.
	 */
	public String toString()
	{
		//String title, double price, int numOfPages, int issueNum, String specialityField
		String result = "This book's title is <<" + getTitle() + ">> and its price is " + getPrice() + " and it has " + getNumOfPages() + " pages. "
				+ "The specialty field for this book is " + specialityField + " and its issue number is " + issueNum + ".";
		
		return result;
	}
	
	/**
	 * Check if the object is null, same class, same attributes
	 * @param paperPublication
	 * @return
	 */
	public boolean equals(Object object)
	{
		if(!(object instanceof Journal))
		{
			return false;			
		}
		else
		{
			Journal bookObject = (Journal)object;
			
			boolean isTitleNull = (bookObject.getTitle() == null);
			
			if(isTitleNull)
			{
				return false;
			}
			
			boolean isSameTitle = bookObject.getTitle().equals(this.getTitle());
			boolean isSamePrice = (bookObject.getPrice() == this.getPrice()) ;
			boolean isSameNumOfPages = (bookObject.getNumOfPages() == this.getNumOfPages());
			
			boolean isSameIssueNum = (bookObject.getIssueNum() == issueNum);
			boolean isSameSpeciality = (bookObject.getSpecialityField().equals(specialityField)); 
			
			if(!isSameTitle || !isSamePrice || !isSameNumOfPages || !isSameIssueNum || !isSameSpeciality)
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
		//String title, double price, int numOfPages, int issueNum, String specialityField
		Journal journal1 = new Journal("JournalTitle", 15.99, 600, 1234, "Psychology");
		
		System.out.println("journal1 = " + journal1.toString());
		
		Journal journal2 = new Journal(journal1);
		System.out.println("journal1 equal journal2? => " + journal1.equals(journal2));
		
		journal1.setTitle("JournalTitle1.1");
		journal1.setPrice(19.99);
		journal1.setNumOfPages(700);
		
		journal1.setIssueNum(2345);
		journal1.setSpecialityField("Social Psychology");

		
		System.out.println("journal1 updated = " + journal1.toString());
		
		System.out.println("journal1 equal journal2? => " + journal1.equals(journal2));
	
		Journal journal3 = new Journal();
		System.out.println("journal1 equal journal3 (null ChildrenBook())? => " + journal1.equals(journal3));
		
		Journal journal4 = null;
		System.out.println("journal1 equal journal4 (null)? => " + journal1.equals(journal4));
	}
}