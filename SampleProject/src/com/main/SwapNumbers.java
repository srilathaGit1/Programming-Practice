 /* Write a program that swaps 2 given numbers. 
You need to have 2 separate functions in the program.*/
package com.main;

public class SwapNumbers {
  
  int number1;
  int number2;
		  
  public int[] swap(int pNumber1, int pNumber2){
	  this.number1 = pNumber1;
	  this.number2 = pNumber2;
	  
	//10, 9
	this.number1 = this.number1 + this.number2; //29
	this.number2 = this.number1 - this.number2; //29 - 19, number2 = 10
	this.number1 = this.number1 - this.number2; //29-10    number1=19
	int[] returnVariables = new int[2];
	returnVariables[0] = this.number1;
	returnVariables[1] = this.number2;
	return returnVariables;
   }
  
   public  int[] swap1(int pNumber1, int pNumber2){
	   this.number1 = pNumber1;
	   this.number2 = pNumber2;
	   int number3;
	   number3 = this.number1;
	   this.number1= this.number2;
	   this.number2 = number3;
	   int[] returnvariables = new int[2];
	   returnvariables[0]= this.number1;
	   returnvariables[1]= this.number2;
	   return returnvariables;
	 
   }
   
   public static int[] swap2(int numbers1, int numbers2){
	  int[] returnvalue = new int[2];
	  returnvalue[0] = numbers1;
	  returnvalue[1] = numbers2;
	  returnvalue[0] = returnvalue[0]+returnvalue[1];//10,9
	  returnvalue[1] = returnvalue[0]-returnvalue[1];//19-9
	  returnvalue[0]= returnvalue[0]-returnvalue[1];//19-10
	  return returnvalue;
	
   }
    
}
