package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ArmStrongNumber;

public class TestArmStrongNumber {
  
	@Test
  public void isTestArmStrong()  {
	  
	  ArmStrongNumber arms = new ArmStrongNumber();
	 
	try {
		boolean result= arms.findArmStrong(153);
		Assert.assertTrue(result);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	
	
  }
	
	
	@Test 
	
	public void testNegativeNumbers(){
		ArmStrongNumber arm = new ArmStrongNumber();
		try{
			boolean result = arm.findArmStrong(353);
			Assert.assertFalse(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
	}
	
}


