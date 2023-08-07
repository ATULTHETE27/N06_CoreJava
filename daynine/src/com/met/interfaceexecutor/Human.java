package com.met.interfaceexecutor;
//implementable class or child class
public class Human implements ColdDrinks,AlcoholDrinks{

	@Override
	public void showDrinks() {
		System.out.println(colddrinksName+" "+ alcoholdrinksName+" "+ brand);
	}

}
