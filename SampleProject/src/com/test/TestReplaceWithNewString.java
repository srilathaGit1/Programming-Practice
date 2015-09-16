package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ReplaceWithNewString;

import org.testng.asserts.*;

public class TestReplaceWithNewString {
  @Test
  public void isTestReplace() {
	  
	  String str= "This is nice";
	 
	  ReplaceWithNewString  repnew= new ReplaceWithNewString();
	  String result = repnew. toConvertAString(str);
	 Assert.assertEquals(result, "This1 is2 nice3");  
  }
  @Test
  public  void negisTestReplace(){
	  String str = "This is nice";
	  ReplaceWithNewString rep = new ReplaceWithNewString();
	  String result = rep.toConvertAString(str);
	  Assert.assertNotEquals(result, "This1 is3 nice3");
	  
  }
}
