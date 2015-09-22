package com.main;

import java.util.ArrayList;

public class CopyArrayListToArray {

	public String[] toCopyArrayList(ArrayList<String> parr){
		
	String[] copiedArray = new String[parr.size()];
	for(int i=0; i<parr.size();i++){
		copiedArray[i]= parr.get(i);
	}
		return copiedArray;
	}
 }
