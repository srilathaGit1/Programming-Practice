
// Write a program to check if a given string of parenthesis has balanced parenthesis or not.
 //For example a string as "(())" is a valid string where as strings

package com.main;

public class BalancedParenthesis {
	
	public boolean hasBalancedParenthesis(String pstr){
		char getChar = ' ';
		int counter1 = 0;
		int counter2 = 0;
		for(int i=0; i<pstr.length();i++){
			getChar = pstr.charAt(i);
			if(getChar=='('){
				counter1++;
			}
			if(getChar==')'){
				counter2++;
			}
			
		}
		if(counter1==counter2){
			return true;
		}
		return false;
	    
	}
	

}
