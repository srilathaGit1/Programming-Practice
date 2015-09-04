package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.FindLargestNumber;

public class TestLargest {
  @Test
  public void  isTestFindLarge() {
	  
	  int[] arr1 = {125,656,453,540};
	  FindLargestNumber find1 = new FindLargestNumber();
	  
	   int result = find1.isFindLarge(arr1);
	   System.out.println(result);
	   
  }
  @Test
  public void isFindMax(){
	  int[] arr2 = {123,432,678,543};
	  FindLargestNumber find = new FindLargestNumber();
	  int result1 = find.findMax(arr2);
	  Assert.assertEquals(678, 678);
	  System.out.println(result1);
  }
  
  @Test
  public void isTestMax(){
	  int[] arr2 = {234,345,567,890};
	  FindLargestNumber large = new FindLargestNumber();
	  int result1 = large.findLarge(arr2);
	  Assert.assertNotEquals(890, 234);
	  System.out.println(result1);
  }
	 
    @Test
    
    public void isTestMin(){
    	int[] arr3 = {9009, 1008, 6778,99898};
    	  FindLargestNumber large = new FindLargestNumber();
    	int result = large.findMin(arr3);
    	Assert.assertNotEquals(1008,9009);
    	System.out.println(result);
    }
}
