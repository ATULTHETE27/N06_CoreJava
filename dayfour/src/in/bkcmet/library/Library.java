//program to demonstrate on access modifier
package in.bkcmet.library;

public class Library {
	//Different access modifier
	public String libraryName;
	private long userId;
	String booksName;
	
	public void displayPublic() {
		System.out.println("Library Name: "+libraryName);
	}
	
	private void displayPrivate() {
		System.out.println("User Id: "+userId);
	}
	
	void displayDefault() {
		System.out.println("Book Name: "+booksName);
	}
}
