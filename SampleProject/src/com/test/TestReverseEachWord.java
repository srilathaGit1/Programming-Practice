package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ReverseEachWord;

public class TestReverseEachWord {
	
	
  @Test
  
  public void testReverseWord() {
	  
	  String str = "This is nice";
	  ReverseEachWord word = new ReverseEachWord();
	  String result = word.toReverseAword(str);	
	  Assert.assertEquals(result, "sihT si ecin");
	  
  }
  
  @Test
  public void negtestReverseEachWord(){
	  String str = "This is nice";
	  ReverseEachWord word = new ReverseEachWord();
	  String result = word.toReverseAword(str);
	  Assert.assertNotEquals(result, "si sihT ecin");
  }
}
