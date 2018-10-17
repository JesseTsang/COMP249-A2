import com.a2.books.Book;
import com.a2.books.ChildrenBook;
import com.a2.books.EducationalBook;
import com.a2.paperpublication.PaperPublication;
import com.a2.periodicals.IssueFrequency;
import com.a2.periodicals.Journal;
import com.a2.periodicals.Magazine;
import com.a2.periodicals.PaperQuality;

/**
 * COMP249 - Assignment 2
 * Part 1 & 2
 * Written by: Tsang Chi Kit (ID: 25692636)
 */
public class Driver 
{
	/**
	 * The method will take as input an array of PaperPublication (an array of any size) 
	 * and returns an array of PaperPublication.
	 * 
	 * @param book
	 * @return
	 */
	public static PaperPublication[] copyBooks(PaperPublication[] book)
	{
		PaperPublication[] copyArray = new PaperPublication[book.length];
		
		for(int i = 0; i < book.length; i++)
		{
			if(book[i] instanceof PaperPublication)
			{
				copyArray[i] = new PaperPublication(book[i]);
			}
			
			if(book[i] instanceof Book)
			{
				copyArray[i] = new Book((Book)book[i]);	
			}
			
			if(book[i] instanceof ChildrenBook)
			{
				copyArray[i] = new ChildrenBook((ChildrenBook)book[i]);	
			}
			
			if(book[i] instanceof EducationalBook)
			{
				copyArray[i] = new EducationalBook((EducationalBook)book[i]);			
			}
			
			if(book[i] instanceof Journal)
			{
				copyArray[i] = new Journal((Journal)book[i]);				
			}
			
			if(book[i] instanceof Magazine)
			{
				copyArray[i] = new Magazine((Magazine)book[i]);			
			}
		}
		
		return copyArray;		
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
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
		Book book1 = new Book("BookTitle", 15.99, 600, 12345567, 2018, "John Doe");
		
		System.out.println("book1 = " + book1.toString());
		
		Book book2 = new Book(book1);
		System.out.println("Book1 equal book2? => " + book1.equals(book2));
			
		book1.setTitle("BookTitle1.1");
		book1.setPrice(19.99);
		book1.setNumOfPages(700);
		//book1.setISBN(987654321);
		//book1.setIssueYear(2019);
		//book1.setAuthor("Jane Doe");
		
		System.out.println("Book1 updated = " + book1.toString());
		
		System.out.println("Book1 equal book2? => " + book1.equals(book2));
		
		Book book3 = new Book();
		System.out.println("Book1 equal book3(null Book())? => " + book1.equals(book3));
		
		Book book4 = null;
		System.out.println("Book1 equal book4(null)? => " + book1.equals(book4));
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author, int minAge
		ChildrenBook childrenBook1 = new ChildrenBook("childrenTitle", 15.99, 600, 12345567, 2018, "John Doe", 8);
		
		System.out.println("ChildrenBook1 = " + childrenBook1.toString());
		
		ChildrenBook childrenBook2 = new ChildrenBook(childrenBook1);
		System.out.println("ChildrenBook1 equal ChildrenBook2? => " + childrenBook1.equals(childrenBook2));
		
		childrenBook1.setTitle("childrenTitle1.1");
		childrenBook1.setPrice(19.99);
		childrenBook1.setNumOfPages(700);
		//childrenBook1.setISBN(135790246);
		//childrenBook1.setIssueYear(2019);
		//childrenBook1.setAuthor("Jane Doe");
		childrenBook1.setMinAge(6);
		
		System.out.println("ChildrenBook1 updated = " + childrenBook1.toString());
		
		System.out.println("ChildrenBook1 equal ChildrenBook2? => " + childrenBook1.equals(childrenBook2));
	
		ChildrenBook childrenBook3 = new ChildrenBook();
		System.out.println("ChildrenBook1 equal ChildrenBook3 (null ChildrenBook())? => " + childrenBook1.equals(childrenBook3));
		
		ChildrenBook childrenBook4 = null;
		System.out.println("ChildrenBook1 equal ChildrenBook4 (null)? => " + childrenBook1.equals(childrenBook4));
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
		//String title, double price, int numOfPages, long ISBN, int issueYear, String author, int editionNum, String specialityField
		EducationalBook educationalBook1 = new EducationalBook("educationalTitle", 15.99, 600, 12345567, 2018, "John Doe", 8, "Self-Help");
		
		System.out.println("EducationalBook1 = " + educationalBook1.toString());
		
		EducationalBook educationalBook2 = new EducationalBook(educationalBook1);
		System.out.println("EducationalBook1 equal EducationalBook2? => " + educationalBook1.equals(educationalBook2));
		
		educationalBook1.setTitle("educationalTitle1.1");
		educationalBook1.setPrice(19.99);
		educationalBook1.setNumOfPages(700);
		//educationalBook1.setISBN(135790246);
		//educationalBook1.setIssueYear(2019);
		//educationalBook1.setAuthor("Jane Doe");
		
		educationalBook1.setEditionNum(9);
		educationalBook1.setSpecialityField("Dentisty");
		
		System.out.println("EducationalBook1 updated = " + educationalBook1.toString());
		
		System.out.println("EducationalBook1 equal EducationalBook2? => " + educationalBook1.equals(educationalBook2));
	
		EducationalBook educationalBook3 = new EducationalBook();
		System.out.println("EducationalBook1 equal ChildrenBook3 (null EducationalBook())? => " + educationalBook1.equals(educationalBook3));
		
		EducationalBook educationalBook4 = null;
		System.out.println("EducationalBook1 equal ChildrenBook4 (null)? => " + educationalBook1.equals(educationalBook4));
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
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
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
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
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
		PaperPublication[] paperPubObject = new PaperPublication[15];
		
		PaperPublication paperPublication5 = new PaperPublication("PaperPublicationTitle5", 15.99, 300);
		PaperPublication paperPublication6 = new PaperPublication("PaperPublicationTitle6", 25.99, 400);
		Book book5 = new Book("BookTitle5", 20.99, 1600, 11223344, 2018, "John Doe");
		Book book6 = new Book("BookTitle6", 30.99, 2600, 22225566, 2017, "Peter Pan");
		Book book7 = new Book("BookTitle7", 40.99, 3600, 55335577, 2016, "Micky Mouse");
		
		ChildrenBook childrenBook5 = new ChildrenBook("childrenTitle5", 115.99, 20, 12345567, 2018, "Times", 8);
		ChildrenBook childrenBook6 = new ChildrenBook("childrenTitle6", 215.99, 30, 12345568, 2017, "Disney", 4);
		ChildrenBook childrenBook7 = new ChildrenBook("childrenTitle7", 315.99, 40, 12345569, 2016, "Disney", 9);
		EducationalBook educationalBook5 = new EducationalBook("educationalTitle5", 55.99, 500, 12555567, 2018, "Dr. John", 8, "Self-Help");
		EducationalBook educationalBook6 = new EducationalBook("educationalTitle6", 65.99, 600, 12565567, 2018, "Jame Doe, PhD.", 8, "Engineering");
		
		EducationalBook educationalBook7 = new EducationalBook("educationalTitle7", 75.99, 700, 12575567, 2018, "Sir Herring", 8, "Finance");
		Journal journal5 = new Journal("JournalTitle5", 155.99, 4600, 3234, "Applied Science");
		Journal journal6 = new Journal("JournalTitle6", 255.99, 5600, 2234, "Psychology");
		Magazine magazine5 = new Magazine("MagazineTitle5", 15.99, 50, PaperQuality.High, IssueFrequency.Monthly);
		Magazine magazine6 = new Magazine("MagazineTitle6", 15.99, 60, PaperQuality.Normal, IssueFrequency.Weekly);
		
		paperPubObject[0] = paperPublication5;
		paperPubObject[1] = paperPublication6;
		paperPubObject[2] = book5;
		paperPubObject[3] = book6;
		paperPubObject[4] = book7;
		
		paperPubObject[5] = childrenBook5;
		paperPubObject[6] = childrenBook6;
		paperPubObject[7] = childrenBook7;
		paperPubObject[8] = educationalBook5;
		paperPubObject[9] = educationalBook6;
		
		paperPubObject[10] = educationalBook7;
		paperPubObject[11] = journal5;
		paperPubObject[12] = journal6;
		paperPubObject[13] = magazine5;
		paperPubObject[14] = magazine6;
		
		PaperPublication highestPageCount = new PaperPublication();
		PaperPublication lowestPageCount = paperPubObject[0]; //Else will have page = 0
		
		for(PaperPublication p: paperPubObject)
		{
			if(p.getNumOfPages() >= highestPageCount.getNumOfPages())
			{
				highestPageCount = p;
			}
			
			if(p.getNumOfPages() <= lowestPageCount.getNumOfPages())
			{
				lowestPageCount = p;			
			}	
		}
		
		System.out.println("Highest page count info: "+ highestPageCount.toString());
		System.out.println("Lowest page count info: " + lowestPageCount.toString());
		
		/***********************************************/
		System.out.println("");
		System.out.println("");
		
		PaperPublication[] paperPubObject2 = copyBooks(paperPubObject);
		
		System.out.println("Original array contents: ------------ ");
		
		for(PaperPublication p: paperPubObject)
		{
			System.out.println(p.toString());
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Copy array contents: ------------ ");
		
		for(PaperPublication p: paperPubObject2)
		{
			System.out.println(p.toString());	
		}	
	}
}