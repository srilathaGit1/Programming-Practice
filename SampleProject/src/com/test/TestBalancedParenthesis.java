package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.BalancedParenthesis;

public class TestBalancedParenthesis {
@Test
	public void  testBalncedParenthesis(){
		String str = "(())";
	BalancedParenthesis bPar = new BalancedParenthesis();
	boolean result = bPar.hasBalancedParenthesis(str);
	Assert.assertTrue(result);	
	}

@Test
public void negTestBalancedParenthesis(){
	String str = "(()))";
	BalancedParenthesis bpar = new BalancedParenthesis();
	boolean result = bpar.hasBalancedParenthesis(str);
	Assert.assertFalse(result);
	
}
}
