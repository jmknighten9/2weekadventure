package com.revature;

import java.sql.Date;
//Fully Qualified Class Name
import com.revature.blueprints.RocketShip;

public class Hello {
	//Single Comment
	/*this
	 * is
	 * a
	 * multi
	 * line
	 * comment
	 */
	//JVM looks for a method with this signature
	//Entry Point
	/*
	 * public- Access modifier (everything can see it)
	 * static- don't need an instance of the class to run a static method
	 * void: return type; doesn't return anything
	 * 
	 * JVM- Java Virtual Machine
	 * 	Converts compiled Java into Machine code that your processor can understand
	 * 	provides portability
	 * JRE- Java Runtime Environment
	 * 	JVM+ libraries
	 * 	Everything we need to RUN Java
	 * JDK - Java Development Kit
	 * 	Contains the JVM and JRE
	 * 	contains Compiler among other things
	 * 	Everything we need to WRITE Java
	 */
	public static void main(String [] args) {
		System.out.println("GoodBye, Earth");
		
		  RocketShip rs1= new RocketShip("Steve",3000,7,true);
		  System.out.println(rs1.getName()); rs1.setName("StillSteve");
		  System.out.println(rs1.toString());
		 
		
		Date d= new Date(1l);//using java.sql.Date
		//if i want to use java.util.date EACH time
		java.util.Date d2= new Date(2l);
		
	}
}
