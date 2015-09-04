package com.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.MissingNumbers;

public class TestMissingNum {
	
@Test
	public void testmis(){
	

	int[] arr = {12,16,18,20};
	
    MissingNumbers num = new MissingNumbers();
    ArrayList<Integer> result = num.missing(arr);
    Assert.assertEquals(result.size(), 5);
    
}

@Test
  public void testmis1(){
	
	int[] arr = {40,53,64,66};
	MissingNumbers num1= new MissingNumbers();
	ArrayList<Integer> result = num1.missing(arr);
	Assert.assertEquals(result.get(0).intValue(), 41);
	
}

}
