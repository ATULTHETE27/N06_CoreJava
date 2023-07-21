////Program to Demonstrate on Arithmetic Operators
package com.met.operators;

import java.util.Scanner;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1 =s.nextInt();
		int num2 =s.nextInt();
		System.out.println("\n"+(num1+num2)+"\n");
		System.out.println(num1-num2+"\n");
		System.out.println(num1*num2+"\n");
		System.out.println(num1/num2+"\n");
		System.out.println(num1%num2+"\n");

	}

}
