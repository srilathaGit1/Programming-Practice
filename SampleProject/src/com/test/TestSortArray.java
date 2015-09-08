package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SortArray;

public class TestSortArray {
  @Test
  public void testSortedArray() {
	  int[] arr = {44,32,68};
	  SortArray sort = new SortArray();
	  int[] result = sort.sortedArray(arr);
	  for(int i=0; i<arr.length; i++){
		  System.out.println(result[i]);
	
	  }
	  Assert.assertEquals(result[0], 32);
	  
  }
  
  @Test
  
  public void negTestSortedArray(){
	  int[] arr = {67,7,89};
	  SortArray sort = new SortArray();
	  int[] result = sort.sortedArray(arr);
	  for(int i=0; i<arr.length; i++){
		  System.out.println(result[i]);
	  }
	  Assert.assertNotEquals(result[0], 67);
  } 
}
