package com.test;

import org.testng.annotations.Test;

import com.main.ReverseAString;

public class TestReverseAString {
  @Test
  public void testRevString() {
	  
	  String str = "This is a reverse String";
	  ReverseAString st= new ReverseAString();
	  String result = st.toReverseAString(str);
	  System.out.println(result);
	
  }
  
}