//Program to Demonstrate to select case with switch case 
package com.met.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice ");

		int songno = s.nextInt();
		switch(songno)
		{
		case 1:
				System.out.println("Jay Shree Ram");
				break;
			
			case 2:
				System.out.println("Om Shanti Om");
				break;
				
			case 3:
				System.out.println("Shivrai");
				break;
		}
		
	}

}
