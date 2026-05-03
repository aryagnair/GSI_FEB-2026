package assignment;
import java.util.*;
class BookM implements Comparable<BookM>
{
	int bookId;
	String bookName;
	int price;
	public BookM(int bookId, String bookName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public int compareTo(BookM b)
	{
		return this.price-b.price;
	}
	void display()
	{
	   System.out.println(bookId+" "+bookName+" "+price);
		
	}
	
}

public class BookManagementSystem {

	public static void main(String[] args) {
     	BookM bk1=new BookM(101, "Java", 499);
     	BookM bk2=new BookM(102, "Python", 399);
     	BookM bk3=new BookM(103, "SQL", 299);
     	BookM bK4=new BookM(104, "C++", 599);
     	
		ArrayList<BookM> book=new ArrayList<BookM>();
		book.add(bk1);
		book.add(bk2);
		book.add(bk3);
		book.add(bK4);
		
		// DISPLAY ALL BOOKS 
		System.out.println("Original List:");
		for(BookM b:book)
		{
			b.display();
		}
		
		System.out.println();
		// SORT BY PRICE 
		System.out.println("After Sorting by Price:");
		Collections.sort(book);
		for(BookM b:book)
		{
	        b.display();    	
		}
		
		System.out.println();
		// REMOVING ID 102
		System.out.println("After Removing Book ID 102:");
		book.remove(1);
		for(BookM b:book)
		{
			b.display();
		}
		
		System.out.println();
		//UPDATING PRICE
		System.out.println("After Updating Price:");
		 for(BookM b:book)
		 {
			 if(b.bookId==103)
			 {
				 b.price=349;
			 }
				 
		 }
		for(BookM b:book)
		{
			b.display();
		}
		
		//Searching book  by name
		System.out.println();
		System.out.println("Search Book by Name");
		String namebook="Java";
		for(BookM b:book)
		{
			if(b.bookName.equalsIgnoreCase(namebook))
				System.out.println("Book Found :"+namebook);
		}
		
		//Final List 
		System.out.println();
		System.out.println("Final List");
		for(BookM b:book )
		{
		 b.display();
		}
		
	}

}
