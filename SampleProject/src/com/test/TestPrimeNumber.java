package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.main.PrimeNumber;

public class TestPrimeNumber {
	
  @Test
  public void isFivePrimeNumber() {
	 PrimeNumber p = new PrimeNumber();
	 boolean result = p.isPrime(5);
	 Assert.assertTrue(result);
	  
  }
  
  @Test
  public void isSixPrimeNumber() {
	
	 boolean result = PrimeNumber.isPrime1(6);
	 Assert.assertFalse(result);
	  
  }
}
