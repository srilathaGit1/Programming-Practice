package com.test;

import org.testng.annotations.Test;
import com.main.NullPointerException;
import org.testng.Assert;

public class TestNullPointetException {
  @Test
  public void testNullPointerException()  {
	  
	  String str = null;
	 try{
	  NullPointerException ex = new NullPointerException();
	  ex.exceptionHandler();
	  Assert.assertFalse(false);
 }
	 catch(Exception e){
		if(e instanceof java.lang.NullPointerException){
		 Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
	 }
	  
  }
}
