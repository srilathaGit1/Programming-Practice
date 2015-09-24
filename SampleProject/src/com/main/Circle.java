//Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants interface and has following behavior.
// 			--> Properties: radius.
// 			--> Constructor: To set number of sides.
// 			--> Overrides all the methods from parents.

package com.main;

 public class Circle extends ShapeWithProperties implements ShapeConstants {
	 private int radius;
	
	public Circle(int pRadius, int pNumberOfSides){
		
		this.radius = pRadius;
		this.setSides(pNumberOfSides);
				
	 }
	
   public void setRadius(int pRadius){
	   this.radius = pRadius;
   }
   
   public int getRadius(){
	 return this.radius;
   }
	
	//overriding calculateArea method
	public double calculateArea(){
			
	  double totalArea = ShapeConstants.pi *this.radius*this.radius;
	  
	  return totalArea;
		
	}
	
	public double calculatePerimeter(){
		
		double perimeter = 2*ShapeConstants.pi*this.radius;
		return 	perimeter;	
	}
	

	
}
