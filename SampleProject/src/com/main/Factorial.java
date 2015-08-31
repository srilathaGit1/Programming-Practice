package com.main;

//Write a program to calculate factorial of a given number. 
//You need to compute the factorial with one logic that uses recursion
//and another logic without recursion.
public class Factorial {
	int n;

	// using without recursion
	public int FindFactorialUsingFor(int Nn) {
		this.n = Nn;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;

		}
		return result;
	}

	private int factorial(int n) {
	       
	       if (n > 0){
	    	   return n * factorial(n - 1);
	       }
	       return 1;
	}
	
	public int FindFactorialWithRecursion(int Nn) {
		this.n = Nn;
		return this.factorial(Nn);
	}
	
	public int FindFactorialWithWhile(int Nn){
		this.n = Nn;
		int result = 1;
		while (n != 0){
			result = result * n;
			n = n-1;
		}
		return result;
	}
}
