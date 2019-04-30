package com.revature.primitive;

public class PrimitiveDataTypes {
	/*Naming Conventions
	 * class and projects: Pascal case- Capitalize each word: PrimitiveDataTypes
	 * methods and variables: CamelCase example- firstSecondThird.
	 * Package names: all lower-case, separated by periods
	 * constants: all caps ex. ALL_CAPS_LOLZ
	 */
	
	
	
	//List of Data Types
	byte minByte= -128;
	byte maxByte= 127;
	//char is 16 bits - all unicode characters
	char myChar= 'a';
	boolean on= true;
	boolean off= false;
	//Numeric types
	//Short 16 bits
	short minShort= -32768;
	short maxShort= 32767;
	//int and float are 32 bits
	int minInt=- 2147483648;
	int maxInt = 2147483647;
	float minFloat= 1.4E-45f;
	float maxFloat= 3.4028235E+38f;
	float test= -5.76879f;
	//long and double are 64 bit
	long minLong =  -9223372036854775808l;
	long maxLong = 9_223_372_036_854_775_807l;
	double minDouble= 4.9E-324;
	double maxDouble= 1.7976931348623157E+308;
	static int a= 5+5;
	static int b= a+7;
	static int c= a+b;
	//static int d= 7/0;
	public static void main(String[] args) {
		
		System.out.println(c);
	}
	
}
