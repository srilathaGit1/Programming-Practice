package com.main;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
	
	public ArrayList<Object> find(Object[] parr){
	 ArrayList<Object> duplicates = new ArrayList<Object>(); 
	 HashSet<Object> uniqueSet = new HashSet<Object>();
	 for(int i=0; i<parr.length; i++){
		 if(uniqueSet.contains(parr[i])){
			 duplicates.add(parr[i]);
			 
			 
		 }
		 
		 else{
			 uniqueSet.add(parr[i]);
		 }
	 }
	return duplicates;
	 
		
		
		
	}
	

}
