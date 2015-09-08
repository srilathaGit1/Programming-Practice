package com.main;

public class SortArray {


	public int[] sortedArray(int[] parr){
		
		boolean swapped = true;
	   while (swapped){
		   swapped = false;
		   for(int i=1; i<parr.length; i++){
			   int temp =0;
			   if(parr[i-1]>parr[i]){
				   temp = parr[i-1];
				   parr[i-1]=parr[i];
				   parr[i] = temp;
				   
			   }
		   }
		   
	   }
		

        return parr;

	}
	
	}
	