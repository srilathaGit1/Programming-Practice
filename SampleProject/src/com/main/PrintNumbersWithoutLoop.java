package com.main;

import java.util.Arrays;

public class PrintNumbersWithoutLoop {
	
	public static void main(String[] args){
	
	
	
		Object[] numbers = new Object[10];
		Arrays.fill(numbers, new Object(){
			private int count = 0;
			
		@Override
	     public String toString() {
            return Integer.toString(++count);
        }
    });
    System.out.println(Arrays.toString(numbers));
   
}
		
		
		
	}


