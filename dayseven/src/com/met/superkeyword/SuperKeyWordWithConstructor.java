//Program to demonstrate on Constructor
package com.met.superkeyword;

class Google
{
	String ceo;
	public Google(String ceo)
	{
		System.out.println("Default Constructor : "+ceo);
	}
}

class Gmail extends Google
{
	String userid;

	public Gmail(String ceo, String userid) {
		//calling to parent class parameterize constructor
		super(ceo);
		this.userid = userid;
		System.out.println(userid);

	}
}


public class SuperKeyWordWithConstructor {

	public static void main(String[] args) {
		Gmail g = new Gmail("Sundar Pichai","abc@gmail.com");
	}

}
