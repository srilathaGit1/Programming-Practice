package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MergeTwoArrays;

public class TestMergeTwoArrays {
  @Test
  public void testMergeArrays() {
	  
	  int[] arr1 ={45,67,89};
	  int[] arr2 = {98,78,6};
	  
	  MergeTwoArrays merge1 = new MergeTwoArrays();
	 
	  int[] result1 = merge1.twoArrayMerge(arr1, arr2);
	  for(int i=0; i<result1.length; i++){
	  
	  
	  }
	  Assert.assertEquals(result1[5], 6);
	 
  }
  
  @Test
  public void negTestMergeArrays(){
	  int[] arr2 = {45,54,89};
	  int[] arr3 = {89,98,90};
	  MergeTwoArrays merge2= new MergeTwoArrays();
	 
	  int[] result1 = merge2.twoArrayMerge(arr2, arr3);
	  for(int i=0; i<result1.length; i++){
		  
	  }
	  Assert.assertNotEquals(result1[4], 89);
  }
}
