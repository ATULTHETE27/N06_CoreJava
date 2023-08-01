package com.met.instanceofdemo;

class RBI
{
	protected String ifscCode="RBIS0NGPA";
}

class SBI extends RBI
{
	public SBI() {
		super.ifscCode="RBIS0NGPA";
		String ifscCode="SBIN0005239";
		System.out.println(ifscCode);
/*if parent class and child class variable name are same, 
 *in such case, use super.variablename to access that
 *variable of parent class inside the child class*/
		System.out.println(super.ifscCode);
	}
	
}
public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s = new SBI(); 
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	}

}
