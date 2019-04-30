package com.revature.classtypes;

public interface Hunt {
	/*
	 * special type of class that cannot be instantiated
	 * specify what a class must do, but not how it does it( sounds like abstraction!)
	 * Interfaces lack instance variables
	 * Methods are declared without a body (abstract)
	 * Since Java 8 they CAN be implemented
	 * All variables are implicitly public, static and final (basically constants)
	 * Interfaces can extend each other, 0 to many
	 * can also implement interfaces, 0 to many
	 * Marker interface- This is an interface with no methods
	 * also called a "tag"
	 * tells the compiler it is of a certain type aka Serializable
	 * 
	 */
	void findPrey();
	
	
}
