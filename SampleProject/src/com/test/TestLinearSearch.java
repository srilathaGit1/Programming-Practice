package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.LinearSearch;

public class TestLinearSearch {
  @Test
  public void isElementExist() {
	  int[] arr = {23,45,67,89};
	  LinearSearch ls= new LinearSearch();
	 boolean result = ls.elementExists(arr, 89);
	 Assert.assertTrue(result);
  }
  
  @Test
  public void negIsElementExists(){
	  int[] arr1 = {123,45,67,89};
	  LinearSearch ls= new LinearSearch();
	  boolean result = ls.elementExists(arr1, 68);
	  Assert.assertFalse(result);
	  }
  
}
