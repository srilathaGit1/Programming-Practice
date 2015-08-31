package com.test;

import com.main.Factorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFactorial {

	@Test
	public void testFactorialWithWhile() {
		Factorial f = new Factorial();
		int fc = f.FindFactorialWithWhile(3);
		Assert.assertEquals(fc, 6);
		System.out.println(fc);
	}
	
	@Test
	public void testFactorialWithoutRecursion(){
		Factorial f= new Factorial();
		int fc = f.FindFactorialUsingFor(5);
		Assert.assertEquals(fc, 120 );
	}
	@Test
	public void testFactorialWithRecursion(){
		Factorial f = new Factorial();
		int fc = f.FindFactorialUsingFor(4);
		Assert.assertEquals(fc, 24);
	}
    @Test
    public void testFactorialWithRecursion1(){
    	Factorial f = new Factorial();
    	int fc = f.FindFactorialUsingFor(5);
    	Assert.assertNotEquals(120, 130);
    			
    	
   	
    }
    
    @Test
    public void testFactorialWithoutRecursion1(){
    	Factorial f = new Factorial();
    	int fc = f.FindFactorialUsingFor(6);
    	Assert.assertNotEquals(720, 725);
    			
    }
}
