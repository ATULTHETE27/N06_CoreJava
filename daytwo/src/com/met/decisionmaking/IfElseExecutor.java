//Program to Demonstrate to check the person is eligible or not
//To donate the blood or not using If-Else
package com.met.decisionmaking;
import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Person is Eligible to Donate Blood ");
		}
		else
		{
			System.out.println("Person is Not Eligible to Donate Blood ");

		}
	}

}
