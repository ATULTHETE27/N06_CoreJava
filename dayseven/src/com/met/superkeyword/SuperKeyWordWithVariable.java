package com.met.superkeyword;

class Building
{
	int floors=23;
	String name= "Prachi";
}

class Flat extends Building
{
	String name= "Atul";
	
	/* If parent class and child class variable name are same,
	 * and if you want to access parent class variable 
	 * inside child class, use super.variablename*/
	void print()
	{
		System.out.println(super.name);
		System.out.println(name);

	}
}


public class SuperKeyWordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
		
		f.print();
	
	}
}
