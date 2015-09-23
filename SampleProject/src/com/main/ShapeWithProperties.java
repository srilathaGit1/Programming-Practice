
//Write a program creating an abstract class Shape with properties
//(noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.
package com.main;

public abstract class ShapeWithProperties {
	
	private int noOfSides;
	private double area;
	private double perimeter;
	
	public double calculateArea(){
	 System.out.println(ShapeConstants.pi);
	 return area;	
	}
	
	public double calculatePerimeter(){
		return 	perimeter;	
	}
	
	public void setSides( int pSides){
		this.noOfSides = pSides;
	}
	

}
