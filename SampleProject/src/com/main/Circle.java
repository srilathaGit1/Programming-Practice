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
	
	 //Method Overloading
   public void setRadius(int pRadius){
	   this.radius = pRadius;
   }
  
   public void setRadius(int pRadius, int pNumberOfSides){
	   this.radius = pRadius;
	   this.setSides(pNumberOfSides);
	   
   }
  
   
   public int getRadius(){
	 return this.radius;
   }
    public void calculateArea(int pNumberOfSides){
    	this.setSides(pNumberOfSides);
    	
    	
    }
    
    public int calculatePerimeter(int pRadius){
    	this.radius = pRadius;
    	return this.radius;
    	}
	//overriding calculateArea method
	public double calculateArea(){
			
	  double totalArea = ShapeConstants.pi *this.radius*this.radius;
	  
	  return totalArea;
		
	}
	//overriding calculatePerimeter method
	public double calculatePerimeter(){
		
		double perimeter = 2*ShapeConstants.pi*this.radius;
		return 	perimeter;	
	}
	

	
}
