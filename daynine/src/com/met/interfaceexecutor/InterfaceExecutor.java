package com.met.interfaceexecutor;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instantiate an interface
		//Sony s = new Sony();
		
		SonySub sl = new SonySub();
		sl.display();
		sl.show();
		Sony.accept();
		
		ISRO i = new ISRO();
		i.status();
		i.displayResult();
		
		Human h = new Human();
		
		h.showDrinks();
	}

}
