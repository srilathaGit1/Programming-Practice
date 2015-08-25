package com.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.main.FibonaciSeries;

public class TestFibonaciSeries {
	
  @Test
  public void isFibonaci() {
	  
	FibonaciSeries feb = new FibonaciSeries();
	int result = feb.isFibonaciSeries(10);
	System.out.println(result);
	/* for (int i=2; i<=10; i++){
		 int result = feb.isFibonaciSeries(i);
		 System.out.println(result); 
	 }*/

  }
  @Test
  public void isFibonaciforTwenty(){
	  int result = FibonaciSeries.isFibonaciSeries1(20);
	  System.out.println(result);
	  /*for (int i=2; i<=20; i++){
		  int result = FibonaciSeries.isFibonaciSeries1(i);
		System.out.println(result);*/
	  }
	  
  }   
	  
  

