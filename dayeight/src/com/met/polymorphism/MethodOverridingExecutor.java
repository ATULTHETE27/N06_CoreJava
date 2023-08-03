package com.met.polymorphism;

class ChiefMinister
{
	static void corruption(String str1, float amount1)
	{
		System.out.println(str1+" corrupted the ammount :  "+amount1);
	}
	
}

class MLA extends ChiefMinister
{
	static void corruption(String str2, float amount2)
	{
		ChiefMinister.corruption("Eknath Shinde", 575758.90f);
		System.out.println(str2+" corrupted the ammount :  "+amount2);
	}
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA.corruption("Dilip Bankar", 999999);
		
	}

}
