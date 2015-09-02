package com.test;

import org.testng.annotations.Test;

import com.main.PrintApattern;

public class TestPrintAPattern {
	
  @Test
  public void testPattern() {
	  PrintApattern pa = new PrintApattern();
	   pa.isPrintPattern();
	  
	  
  }
}
