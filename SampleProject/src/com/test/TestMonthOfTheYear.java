package com.test;

import java.time.Month;

import org.testng.annotations.Test;

import com.main.MonthsOfTheYear;

public class TestMonthOfTheYear {
	
  @Test
  public void testMonth() {
	  MonthsOfTheYear months = new MonthsOfTheYear();
	  months.printEnum();
	  
  }
 
}
