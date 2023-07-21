//Program to Demonstrate on Logical Operators
package com.met.operators;

import java.util.Scanner;

public class TernaryOperatorsDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num =s.nextInt();
		String result= (num%2==0)?"Even":"Odd";
		System.out.println("Result is: "+result);
	}

}
