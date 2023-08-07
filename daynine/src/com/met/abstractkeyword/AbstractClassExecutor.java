package com.met.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		/* We can't create the object for abstract class */
		//Sandwich s = new Sandwich();
		
		CheeseCornSandwich s = new CheeseCornSandwich();
		s.prepare();
		s.showReceipe();
	}

}
