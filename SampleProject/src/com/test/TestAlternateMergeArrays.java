package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.AlternateMergeArrays;

public class TestAlternateMergeArrays {
  @Test
  public void testMergeArrays() {
	  String[] arr1 = {"a1", "a2"};
	  String[] arr2 = {"b1", "b2"};
	  AlternateMergeArrays result = new AlternateMergeArrays();
	  String[] result1 = result.mergeArrays(arr1, arr2);
	  Assert.assertEquals(result1[1], "b1");
	
  }
  @Test
  public void negtestMergeArrays(){
	  String[] arr1 = {"a1", "a2"};
	  String[] arr2 = {"b1", "b2"};
	  AlternateMergeArrays result = new AlternateMergeArrays();
	  String[] result1 = result.mergeArrays(arr1, arr2);
	  Assert.assertNotEquals(result1[1], "a2");
	
	  
  }
	  
}
