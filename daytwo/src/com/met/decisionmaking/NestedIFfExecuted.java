//Program to Demonstrate to check the person is eligible or not for bunjee jumping with neasted if else

package com.met.decisionmaking;
import java.util.Scanner;

public class NestedIFfExecuted {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee jumping");
				if(age>=110)
				{
					System.out.println("Extra ropes will be added ");
				}
			}
		}
		else 
		{
			System.out.println("Not Eligible");
		}
		

	}

}
