
package com.met.thiskeyworddemo;

class Bank
{
	long accountNo;
	
	Bank(long accountNo){
		
		this.accountNo = accountNo;     // This keyword is used here 
//		System.out.println(accountNo);
	}
	void display() {
		System.out.println(accountNo);
	}

}

public class ThisKeyWordDemoTwo {

	public static void main(String[] args) {
		Bank b = new Bank(45236875L);
		b.display();
	}

}