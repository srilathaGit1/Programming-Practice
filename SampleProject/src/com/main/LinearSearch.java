
//Write a program to perform a linear search on any given array.
//Linear search is the basic search where you look for the element to be searched in a sequential way.

package com.main;


public class LinearSearch {
	
	public boolean elementExists( int[] parr, int parr1){

	 for(int i=0; i<parr.length; i++){
		 if(parr[i]==parr1){
			 return true;
		 }
		 
	 }
	 return false;
	}

}
