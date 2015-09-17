package com.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.main.PalindromeString;

public class TestPalindromeString {
  @Test
  public void testForPalindrome() {
	  
	  String str = "aba";
	  PalindromeString str1 = new PalindromeString();
	  boolean result = str1.isPalindrome(str);
	  Assert.assertTrue(result);
	  
  }
  @Test
  public void testUsingAnotherClass(){
	  String str = "radar";
	  PalindromeString str1 = new PalindromeString();
	  boolean result = str1. isPalindromeUsingAnotherClass(str);
	  Assert.assertTrue(result);
	  
	  
  }
  @Test
  public void negUsingAnotherClass(){
	  String str = "deed1";
	  PalindromeString str1 = new PalindromeString();
	  boolean result = str1.isPalindrome(str);
	  Assert.assertFalse(result);
	  
  }
  
}
