
package com.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.FindCommonNumber;

public class TestFindCommomNumber {

	@Test
	public void isFindCommonNum() {

		int[] farr = { 13, 54, 67, 89 };
		int[] sarr = { 54, 99, 89, 90 };

		FindCommonNumber comm = new FindCommonNumber();

		ArrayList<Integer> arr = comm.isCommon(farr, sarr);
		Assert.assertEquals(2, 2);
	}

	@Test
  	public void negFindCommonNum(){
  		  int[] farr= {34,36,87,88};
  		  int[] sarr= {23,34,80,86};
  		  FindCommonNumber comm = new FindCommonNumber();
  		  ArrayList<Integer> arr = comm.isCommon(farr,sarr);
  		  Assert.assertNotEquals(1, 2);
					  
  		  
  				  
  		  }
  		  
  	}



