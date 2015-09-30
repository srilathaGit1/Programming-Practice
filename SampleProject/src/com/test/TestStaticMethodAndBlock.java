package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.main.StaticMethodAndBlock;

public class TestStaticMethodAndBlock {
	

  @Test
  public void testStaticMethod() {
	 StaticMethodAndBlock result = new StaticMethodAndBlock();
	
	  int result1 = result.thisIsStaticMethod(10);
	  System.out.println(result1);
	
		  
	 }
	
	
	 
	 
	  
	  
	  

	  
  }
  

  

