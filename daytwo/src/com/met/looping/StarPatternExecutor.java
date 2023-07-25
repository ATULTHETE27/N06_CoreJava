//Program to Demonstrate to print star pattern in pyramid structure in for Loop Executor
package com.met.looping;
import java.util.Scanner;

public class StarPatternExecutor 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0; i<n; i++)
		{
			for(int j=n-1; j>i; j--)
			{
				System.out.print(" ");
				
			} 

			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
				}
				System.out.println();
		}
		
				

	}

				

			
}


