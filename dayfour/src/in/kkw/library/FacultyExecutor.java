//program to demonstrate on access modifier
//driver class
package in.kkw.library;
import in.bkcmet.library.*;
//import in.bkcmet.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library l = new Library();
		
		l.libraryName = "Bhujbal Library";
		l.displayPublic();
		/* user Id and displayPrivate()method is private, so we can't access into another package or class,only we can access inside the same class*/
		//l.userId = 123456;
		//l.displayPrivate();
		
		/*Books name and displayDefault() method is default, we can.t access into another package, only we can access it within the same package*/
		//l.booksName;
		//l.displayDefault();
	}

}
