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
    ArrayList<Integer> result = num.isMissing(arr);
    Assert.assertEquals(result.size(), 5);
    
}

@Test
  public void testmis1(){
	
	int[] arr = {40,53,64,66};
	MissingNumbers num1= new MissingNumbers();
	ArrayList<Integer> result = num1.isMissing(arr);
	Assert.assertEquals(result.get(0).intValue(), 41);
	
}

@Test
public void negTestmis1(){
	int[] arr1= {12,15,17};
	MissingNumbers num2= new MissingNumbers();
	ArrayList<Integer> result1 = num2.isMissing(arr1);
	Assert.assertNotEquals(13, 14);
}

}
