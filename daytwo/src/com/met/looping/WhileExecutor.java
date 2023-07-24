//Program to Demonstrate Enhanced While Loop Executor

package com.met.looping;

import java.util.Scanner;

public class WhileExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num>=1) {
			System.out.println(num+" ");
			num--;
		}
	}

}
