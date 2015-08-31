package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SwapNumbers;

public class TestSwapNumbers {
	
@Test
public void isTestSwapNumbers(){
	SwapNumbers s = new SwapNumbers();
	int[] returnValues = s.swap(10, 9);
    Assert.assertEquals(returnValues[0], 9);
	
	
}
@Test
public void isTestSwapNumbers1(){
	SwapNumbers s = new SwapNumbers();
	int[] returnValues = s.swap1(19, 11);
	Assert.assertEquals(returnValues[0], 11);
}	
@Test
public void isTestSwapNumbers2(){
	int[] i = SwapNumbers.swap2(10, 9);
	Assert.assertEquals(i[0], 9);
	
}
@Test
public void isTestSwapNumbersNeg(){
	SwapNumbers sw = new SwapNumbers();
	int[] returnValues = sw.swap(10, 9);
	Assert.assertNotEquals(returnValues[0], 10);
			
}

@Test
public void isTestSwapNumberNeg1(){
	SwapNumbers sw = new SwapNumbers();
	int[] returnvalues = sw.swap1(10, 19);
	Assert.assertNotEquals(returnvalues[0], 10);

	
}

	

@Test
public void isTestSwapNumbersNeg2(){
	int[] i = SwapNumbers.swap2(10, 19);
	Assert.assertNotEquals(i[0], 10);
	
}

}


