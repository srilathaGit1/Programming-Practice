package com.test;

import org.testng.annotations.Test;

import com.main.ReplaceSubString;
import org.testng.Assert;


public class TestReplaceSubString {
	
@Test
 public void testFindAndReplaceString(){
	 String str = "Hello World";
	 String pFindString =  "World";
	 String pReplaceString = "Every One";
	 ReplaceSubString find =  new ReplaceSubString();
	 String result = find.findAlternateSubString(str, pFindString, pReplaceString);
     Assert.assertEquals(result, "Hello Every One");

	 }

@Test
public void negTestFindAndReplaceString(){
	String str = "Hello World";
	String findString = "Hello";
	String replaceString = "Hi";
	ReplaceSubString replace = new ReplaceSubString();
	String result =replace.findAlternateSubString(str, findString,replaceString);
	Assert.assertNotEquals(result, "World");
			
}
 }


