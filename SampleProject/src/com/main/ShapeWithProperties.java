
//Write a program creating an abstract class Shape with properties
//(noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.
package com.main;

public abstract class ShapeWithProperties {
	
	private int noOfSides;

	public double calculateArea(){
	 //System.out.println(ShapeConstants.pi);
	 return 0;	
	}
	
	public double calculatePerimeter(){
		return 0;	
	}
	
	public void setSides( int pSides){
		this.noOfSides = pSides;
	}
	
	public int getSides(){
		return this.noOfSides;
	}

}
