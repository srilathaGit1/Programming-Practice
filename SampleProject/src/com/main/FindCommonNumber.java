package com.main;

import java.util.ArrayList;

public class FindCommonNumber {
	
	
	public ArrayList<Integer> isCommon(int[] parr1, int[] parr2){
		int[] arr1 = new int[parr1.length];
		int[] arr2 = new int[parr2.length];
	    ArrayList<Integer> returnList = new ArrayList<Integer>();
	    
		for( int i=0; i<arr1.length; i++){
			
			for(int j=0; j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					
					returnList.add(arr1[i]);
					
				}
			}
			
			
		}
		
		return returnList;
		
	}

}
