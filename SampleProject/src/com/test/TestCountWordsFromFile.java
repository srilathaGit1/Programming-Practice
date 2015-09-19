package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CountWordsInAFile;

public class TestCountWordsFromFile {
  @Test
  public void testCountWords() {
	  
	  String input = "C:\\li\\Auto.txt";
	  CountWordsInAFile fi= new CountWordsInAFile();
	  int result = fi.toCountWordsFromFile(input);
	  Assert.assertEquals(result, 1151);
	  
	  
  }
}
