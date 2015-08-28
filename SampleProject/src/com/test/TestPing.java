package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Ping;

public class TestPing {
  
@Test
  public void isTestPing() {
	  
	  Ping p = new Ping();
	 String st = p.isPrintPing(20);
	 Assert.assertEquals( st, "pong" );
	 
	}
  
  @Test
  public  void isTestPing1(){
	 String st = Ping.isPrintPing1(22);
	    Assert.assertEquals( st, "str1");
	      
    
	 
  }
  
  @Test
  public void isPrintPing1(){
	  Ping p = new Ping();
	  String str = p.isPrintPing(20);
	  Assert.assertNotEquals(str, "ping");
	  
  }
  
  @Test
  public void isPrintPing2(){
	  Ping p = new Ping();
	  String str = p.isPrintPing(18);
	  Assert.assertNotEquals(str, "pong");
  }
}
