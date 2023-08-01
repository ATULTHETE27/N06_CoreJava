package com.met.thiskeyworddemo;

class Team
{
	int size;
	
	// 1. Default Constructor
	Team()
	{
		// Calling to parameterized Constructor
		this(7);  //--> Here we called first Parameterized constructor so it will give the output parameterized constructor first
		System.out.println("Default Constructor");
	}
	
	// 2. Parameterized Constructor
	Team(int size)
	{
		System.out.println("Parameterized Constructor: " + size);
	}
}
public class ThisKeyWordDemoThree {

	public static void main(String[] args) {
		Team t = new Team();

	}

}
