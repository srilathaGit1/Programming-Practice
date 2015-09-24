package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.Circle;

public class TestCircle {
	@Test
	public void testRadiusOfCircle() {
		int radius = 6;
		Circle circle = new Circle(radius, 0);
		double result = circle.calculateArea();
		Assert.assertEquals(result, 113.03999999999999);

	}

	@Test
	public void testCalculatePerimeter() {
		int radius = 7;
		Circle circle = new Circle(7, 0);
		double result = circle.calculatePerimeter();
		Assert.assertNotEquals(result, 44.0);
	}

}