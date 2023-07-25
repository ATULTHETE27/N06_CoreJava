//Program to Demonstrate the counting the digits in given no  with DoWhile Loop Executor
package com.met.looping;

public class CountNoExecutor 
{
	public static void main(String[] args) 
	{

	    int count = 0, num = 7856124;

	    do{
		      num /= 10;
		      ++count;
	    }while(num != 0);

	    System.out.println("Number of digits: " + count);	
	}
}
