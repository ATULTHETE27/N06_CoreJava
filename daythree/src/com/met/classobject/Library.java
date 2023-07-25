//Program to Demonstrate on default and Parameterized Constructor
package com.met.classobject;

public class Library {
	//Public Data members
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	
	public Library()
	{
		System.out.println("Default Constructor");

	}
	//parameterized constructor
	public Library(long noOfBooks, String authorName, String bookName, double d) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = d;
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	


		

}
