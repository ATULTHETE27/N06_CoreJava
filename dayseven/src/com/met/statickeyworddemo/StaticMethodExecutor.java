package com.met.statickeyworddemo;

public class StaticMethodExecutor {
	String name= "BKC";
	static float percentage = 75.56f;
	/*static method

	/if any method outside the main function and if you want to 
	 *access that method inside the main function, make it as static/.*/
	static void displayScore(int score)
	{
		System.out.println(percentage);
		/* we can't use non-static variable inside static method */
		System.out.println("Score is : "+score);
		
	}
	public static void main(String[] args) {
		displayScore(56);
	}

}
