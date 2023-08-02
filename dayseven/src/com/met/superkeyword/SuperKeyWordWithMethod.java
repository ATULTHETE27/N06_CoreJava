package com.met.superkeyword;

class MET
{
	String ownerName="Chagan Bhujbal"; 
	
	void displayName()
	{
		System.out.println("Owner is: "+ownerName);
	}
}

class BKC extends MET
{
	String ownerName="Shefali Bhujbal"; 
	
	void displayName()
	{
		super.displayName();
		System.out.println("Owner is: "+ownerName);
	}
}

public class SuperKeyWordWithMethod {

	public static void main(String[] args) {
		BKC b = new BKC();
		
		b.displayName();
	}

}
