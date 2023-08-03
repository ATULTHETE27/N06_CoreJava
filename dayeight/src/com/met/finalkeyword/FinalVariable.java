package com.met.finalkeyword;

public class FinalVariable {
/*final variable must be initialize during deceleration*/
	//final int x;
	
	final float SALARY = 67000.25f;
	
	void print()
	{
		/* we can't change the value of final variable*/
		//salary=89000.16f;
		System.out.println("Salary is: "+SALARY);
	}
}
