/* their are n people standing in a circle waiting to the executed. 
 * the counting out begins at some point in the circle and proceeds around the circle in a fix direction. 
 * in each step a certain no of people are skipped and the next person is executed. 
 * the elimination proceeds around the circle(which is becoming smaller and smaller as the executed people remove), until only the last person remain, 
 * who is given freedom;given the total no of person and the no k which indicate that k-1 person is skipped and the killed in a circle.
 * the task is to chose the person in the initial circle that  survive; */

package com.met.dayfourchallenges;
import java.util.Scanner;
public class CircleSurvievCehallenge{
	
	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value for n and k: ");
		
		int n= s.nextInt();
		int k = s.nextInt();
		
		System.out.println(survive(n,k));
		
	}
}
