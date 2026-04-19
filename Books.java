package assignment;

class Book{
	
		String title;
		String author;
		static String libraryName="City Library";
		final int ISBN=12345;
		
		Book(String title,String author)
		{
	      this.title=title;
	      this.author=author;
		}
		
		void display()
		{
			System.out.println("Title :"+title+ "\nAuthor :"+author);
		}
		void getDescription()
		{
			System.out.println("This is a Physical Book ");
		}
		static void showLibrary()
		{
			System.out.println("Library name :"+libraryName );
		}
}
		class EBook extends Book
		 {
			double fileSize;
		
			 EBook(String title,String author,double fileSize)
			 {
				 super(title, author);
				 this.fileSize=fileSize;
			 }
		 
				 void display()
					{
					 super.display();
						System.out.println("File Size :"+ fileSize+" MB");
					}
				 void getDescription()
				 {
					 System.out.println("This is an Electronic Book ");
				 }
		 }
	 
public class Books {
	public static void main(String[] args) {
   
		  EBook ebook = new EBook("Atomic Habits", "James Clear", 5);
		  ebook.display();
		  System.out.println();

		  Book book= new Book(null, null) ;
		  book.getDescription();
		  ebook.getDescription();
		  System.out.println();
		
		  Book.showLibrary();
		  System.out.println();
		 
		 System.out.println("ISBN :"+book.ISBN);
		 // book.ISBN=44555; //showing error as  remove the final 
		 System.out.println();
		 
		  String books="java programming";
		  System.out.println("Uppercase: "+books.toUpperCase());
		  System.out.println("Length: "+books.length());
		  System.out.println("Contains Java: "+books.contains("java"));
	} 
	 
	}



