package com.met.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		
		// setting a value to Private data members
		h.setAccType("Saving Account");
		h.setAccountNo(123456789);
		h.setAtmCardNo(789456123);
		h.setPinNo(1221);
		
		//		System.out.println("Account no is: "+h.getAccountNo());
// Below line will call to toString() method
		System.out.println(h);
	}

}
