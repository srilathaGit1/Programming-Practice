package com.main;

public class FindLargestNumber {

	int[] arr;
	public int isFindLarge(int[] parr){
		this.arr = parr;
		int[] arr = new int[parr.length];
		for(int index=0; index<arr.length; index++){
			arr[index] = parr[index];
 		}
		
		int max = arr[0];
		int min = arr[0];
		
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}else{
				min= arr[i];
			}
		} return max;
		
	}
	
	 public int findMax(int[] parr){
		 int[]arr = parr.clone();
		 int max = arr[0];
		 int min = arr[0];
		 for(int i =0; i<arr.length; i++){
			 if(arr[i]>max){
				 max = arr[i];
			 }else{
				 min = arr[i];
			 }
		 }return max;
		 
	 }
	 
	 
	 
	 public int findLarge(int[] parr){
		 int max = parr[0];
		 int min = parr[0];
		 for(int index=0; index<parr.length; index++){
			
			 if(parr[index]>max){
				 max = parr[index];
				 
			 }else{
				 min = parr[index];
			 }
					 
	 } return max;

	}
	 public int findMin(int[] parr){
		 int max = parr[0];
		 int min = parr[0];
		 for(int i=0; i<parr.length; i++){
			 if(parr[i]< min){
				 min= parr[i];
				 
			 }else{
				 max=parr[i];
			 }
		 }return min;
		 
		 
		 
	 }
	
}
	

