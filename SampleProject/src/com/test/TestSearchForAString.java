package com.test;

import org.testng.annotations.Test;

import com.main.SearchForAString;

import org.testng.Assert;
public class TestSearchForAString {
  @Test
  public void testToCountAString() {
	  String filename = "C:\\folder\\ Notes.txt";
	  String word = "testing";
	  SearchForAString search = new SearchForAString();
	  int result = search.isSearchForString(filename, word);
	  Assert.assertEquals(result, 6);
	  
	  
  }
  
  @Test
  public void negTestCountAString(){
	  String fileName = "C:\\folder\\ Notes.txt" ;
	  String word =  "testing";
	  SearchForAString search = new SearchForAString();
	  int result = search.isSearchForString(fileName, word);
	  Assert.assertNotEquals(result, 8);
	  
  }
}
