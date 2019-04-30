package com.revature.varargs;

public class FunWIthVarargs {
	//Var args- Variable Length Arguments
	// A Method that will take a variable number of arguments
	//must be the last argument
	// can be of any type

	public static void main(String[] args) {
		vaTest(19);
		vaTest(1,4,2,555,255,62,62);

	}
	
	public static void vaTest( int ... v) {//... is how we declare a var args
		//Automates and hides the process of creating and saving the values into an array
		// prior to invoking the method
		System.out.println("Number of arguments is: "+ v.length+ " Contents:");
		
		//For each/Augmented For loop- used with collections
		for (int x: v) {
			System.out.println(x);
		}
	}
	
}
