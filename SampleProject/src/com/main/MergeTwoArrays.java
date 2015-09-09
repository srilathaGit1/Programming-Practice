package com.main;

public class MergeTwoArrays {
	
	public int[] twoArrayMerge(int[]parr, int[] parr1){
		
		int[] merge = new int[parr.length+parr1.length];
		int mergeArr = 0;
		for(int i=0; i<parr.length;i++){
			merge[mergeArr] = parr[i];
			mergeArr++;
			
		}
		
		
 		for(int i=0; i<parr1.length; i++){
 			merge[mergeArr] = parr1[i];
 			mergeArr++;
 			
 		}
 		
 		return merge; 
 		
	}
   
}
