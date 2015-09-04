package com.main;
//Write a program  to check an armstrong number i.e. whether the if we power up the each individual number to the total number of digits in the number and add them it should be equal to the number itself.
//For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.

public class ArmStrongNumber {
	
	public boolean findArmStrong(int pFactArm){
		String str = Integer.toString(pFactArm);
		double result = 0;
		for(int i = 0; i<str.length(); i++){
			double temp = Double.parseDouble(str.substring(i, i+1));
			result = result+Math.pow(temp, 3);
			System.out.println(result+" ," +i);
	
			}
		
		if(result==new Double(pFactArm).doubleValue()){
			
			
			
			return true;
		
			}
		   return false;
			
		}
	
	
	
		

		
	}



