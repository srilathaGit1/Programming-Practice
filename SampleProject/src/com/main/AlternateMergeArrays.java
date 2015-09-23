package com.main;

public class AlternateMergeArrays {
	
	public String[] mergeArrays(String[] parr, String[] parr1){
		String[] merge = new String[parr.length+parr1.length];
		int mergeCounter = -1;
		for(int i=0; i < merge.length; i++){
			if(i<parr.length){
				mergeCounter++;
				merge[mergeCounter] = parr[i];
			}
			if(i<parr1.length){
				mergeCounter++;
				merge[mergeCounter] = parr1[i];
			}		
		}	
	    return merge;		
	}
}
