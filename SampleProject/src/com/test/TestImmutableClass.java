package com.test;

import org.testng.annotations.Test;

import com.main.ImmutableClass;

public class TestImmutableClass {
  @Test
  public void testImmutableClass() {
	  
	  int empId = 4567;
	  ImmutableClass table = new ImmutableClass(empId);
	  System.out.println(table);
	  
	  table = new ImmutableClass(4568);
	  
	  System.out.println(table);
	  
  }
}
