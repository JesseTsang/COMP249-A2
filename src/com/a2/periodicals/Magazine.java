package com.a2.periodicals;

import com.a2.paperpublication.PaperPublication;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class Magazine extends PaperPublication
{
	private PaperQuality paperQuality;
	private IssueFrequency issueFrequency;
	
	/**
	 * Default constructor
	 */
	public Magazine()
	{
		super();
	}
	
	/**
	 * 
	 * @param title
	 * @param price
	 * @param numOfPages
	 * @param paperQuality
	 * @param issueFrequency
	 */
	public Magazine(String title, double price, int numOfPages, PaperQuality paperQuality, IssueFrequency issueFrequency)
	{
		//String title, double price, int numOfPages
		super(title, price, numOfPages);
		
		this.paperQuality = paperQuality;
		this.issueFrequency = issueFrequency;		
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param magazine
	 */
	public Magazine(Magazine magazine)
	{
		this(magazine.getTitle(), magazine.getPrice(), magazine.getNumOfPages(), magazine.getPaperQuality(), magazine.getIssueFrequency());	
	}

	public PaperQuality getPaperQuality() {
		return paperQuality;
	}

	public void setPaperQuality(PaperQuality paperQuality) {
		this.paperQuality = paperQuality;
	}

	public IssueFrequency getIssueFrequency() {
		return issueFrequency;
	}

	public void setIssueFrequency(IssueFrequency issueFrequency) {
		this.issueFrequency = issueFrequency;
	}
	
	/**
	 * toString method.
	 */
	public String toString()
	{
		//String title, double price, int numOfPages, PaperQuality paperQuality, IssueFrequency issueFrequency
		String result = "This book's title is <<" + getTitle() + ">> and its price is " + getPrice() + " and it has " + getNumOfPages() + " pages. "
				+ "The paper quality is " + paperQuality + " and its issuing frequency is " + issueFrequency + ".";
		
		return result;
	}
	
	/**
	 * Check if the object is null, same class, same attributes
	 * @param paperPublication
	 * @return
	 */
	public boolean equals(Object object)
	{
		if(!(object instanceof Magazine))
		{
			return false;			
		}
		else
		{
			Magazine bookObject = (Magazine)object;
			
			boolean isTitleNull = (bookObject.getTitle() == null);
			
			if(isTitleNull)
			{
				return false;
			}
			
			boolean isSameTitle = bookObject.getTitle().equals(this.getTitle());
			boolean isSamePrice = (bookObject.getPrice() == this.getPrice()) ;
			boolean isSameNumOfPages = (bookObject.getNumOfPages() == this.getNumOfPages());
			
			boolean isSamePaperQuality = (bookObject.getPaperQuality().equals(paperQuality));
			boolean isSameIssueFreq = (bookObject.getIssueFrequency().equals(issueFrequency));
			
			if(!isSameTitle || !isSamePrice || !isSameNumOfPages || !isSamePaperQuality || !isSameIssueFreq)
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
		//String title, double price, int numOfPages, PaperQuality paperQuality, IssueFrequency issueFrequency
		Magazine magazine1 = new Magazine("MagazineTitle", 15.99, 30, PaperQuality.High, IssueFrequency.Monthly);
		
		System.out.println("Magazine1 = " + magazine1.toString());
		
		Magazine magazine2 = new Magazine(magazine1);
		System.out.println("Magazine1 equal Magazine2? => " + magazine1.equals(magazine2));
		
		magazine1.setTitle("Magazine1.1");
		magazine1.setPrice(19.99);
		magazine1.setNumOfPages(700);
		
		magazine1.setPaperQuality(PaperQuality.Low);
		magazine1.setIssueFrequency(IssueFrequency.Weekly);
		
		System.out.println("Magazine1 updated = " + magazine1.toString());
		
		System.out.println("Magazine1 equal Magazine2? => " + magazine1.equals(magazine2));
	
		Magazine magazine3 = new Magazine();
		System.out.println("Magazine1 equal Magazine3 (null ChildrenBook())? => " + magazine1.equals(magazine3));
		
		Magazine magazine4 = null;
		System.out.println("Magazine1 equal Magazine4 (null)? => " + magazine1.equals(magazine4));
	}
}