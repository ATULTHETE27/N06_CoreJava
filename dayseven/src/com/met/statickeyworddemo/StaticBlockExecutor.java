package com.met.statickeyworddemo;

public class StaticBlockExecutor {

	String name;
	static float percentage;
	/*static block is used to initialize static variable and we can't initialize any non-static variable inside the static block*/
	static {
		//name = "Atul";
		percentage=75.56f;
		
		System.out.println(percentage);
		//System.out.println("Name is : "+name);
	}
	
	public static void main(String[] args) {
		/* Main function is static and hence it calls static block, method and function directly called*/
	}

}
