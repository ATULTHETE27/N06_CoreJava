//program to demonstrate interface
package com.met.interfaceexecutor;

public interface Sony {
	/* By default all the variables inside an interface is public static final;*/
	int noOfChannels = 9;
	//by default all the method inside an interface is an abstract method
	void display();
	/*java 8 provide static and default method inside interface*/
	//static method
	static void accept() {
		System.out.println("Static Method");
	}
	//default method
	default void show() {
		System.out.println("Default Method");
	}
}
