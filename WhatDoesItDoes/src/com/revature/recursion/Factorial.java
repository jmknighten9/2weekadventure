package com.revature.recursion;

public class Factorial {
/*
 * 5!= 5*4*3*2*1
 */
	int bangfact(int n) {
		int result;
		
		if(n==1) return 1;
		result =bangfact(n-1)*n;
		System.out.println(result);
		return result;
	}
}
