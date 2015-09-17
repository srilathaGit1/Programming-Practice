package com.main;

public class PalindromeString {

	public boolean isPalindrome(String pstr) {
		String palindrome = "";
		for (int i = pstr.length() - 1; i >= 0; i--) {
			palindrome = palindrome + pstr.charAt(i);
		}
		
		if(palindrome.equals(pstr)){
			return true;
		}
		return false;

	}
	
	public boolean isPalindromeUsingAnotherClass(String pstr) {
	String palindrome = "";
	ReverseAString reverse = new ReverseAString();
	 palindrome = reverse.toReverseAString(pstr);
		
		if(palindrome.equals(pstr)){
			return true;
		}
		return false;

	}

}
