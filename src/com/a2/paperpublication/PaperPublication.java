package com.a2.paperpublication;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class PaperPublication 
{
	private String title;
	private double price;
	private int numOfPages;
	
	/**
	 * Default constructor
	 */
	public PaperPublication()
	{
		//		
	}
	
	/**
	 * Parameterized constructor
	 * 
	 * @param title
	 * @param price
	 * @param numOfPages
	 */
	public PaperPublication(String title, double price, int numOfPages)
	{
		this.title = title;
		this.price = price;
		this.numOfPages = numOfPages;		
	}
	
	/**
	 * Copy constructor
	 * 
	 * @param paperPublication
	 */
	public PaperPublication(PaperPublication paperPublication)
	{
		this(paperPublication.getTitle(), paperPublication.getPrice(), paperPublication.getNumOfPages());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	/**
	 * toString method.
	 */
	public String toString()
	{
		String result = "This paper publication has title <<" + title + ">> and its price is " + price + " and it has " + numOfPages + " pages.";
		
		return result;
	}
	
	/**
	 * Check if the object is null, same class, same attributes
	 * @param paperPublication
	 * @return
	 */
	public boolean equals(Object object)
	{
		if(!(object instanceof PaperPublication))
		{
			return false;			
		}
		else
		{
			PaperPublication paperObject = (PaperPublication)object;
			
			boolean isTitleNull = (paperObject.getTitle() == null);
			
			if(isTitleNull)
			{
				return false;
			}
			
			boolean isSameTitle = paperObject.getTitle().equals(title);
			boolean isSamePrice = (paperObject.getPrice() == price) ;
			boolean isSameNumOfPages = (paperObject.getNumOfPages() == numOfPages);
			
			if(!isSameTitle || !isSamePrice || !isSameNumOfPages)
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
		PaperPublication paperPublication1 = new PaperPublication("PaperPublicationTitle", 15.99, 600);
		
		System.out.println("paperPublication1 = " + paperPublication1.toString());
		
		PaperPublication paperPublication2 = new PaperPublication(paperPublication1);
		System.out.println("PaperPublication1 equal PaperPublication2? => " + paperPublication1.equals(paperPublication2));
		
		paperPublication1.setTitle("title1.1");
		paperPublication1.setPrice(19.99);
		paperPublication1.setNumOfPages(700);
		
		System.out.println("paperPublication1 updated: " + paperPublication1.toString());
		
		//System.out.println(book1.getClass());
		
		System.out.println("PaperPublication1 equal PaperPublication2? => " + paperPublication1.equals(paperPublication2));
		
		PaperPublication paperPublication3 = new PaperPublication();
		System.out.println("PaperPublication1 equal PaperPublication3? => " + paperPublication1.equals(paperPublication3));
	}
}
