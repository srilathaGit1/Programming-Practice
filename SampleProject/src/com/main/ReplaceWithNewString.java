package com.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;

public class ReplaceWithNewString {
	
	public String toConvertAString(String pOriginalString){
		
		
		int count =0;
        String pReplaceString = "";
     
        String[] splitString = pOriginalString.split(" ");
		for(int i=0; i<splitString.length; i++){
			
			if(i == splitString.length-1){
				
				count++;
				
				pReplaceString = pReplaceString+splitString[i]+count;
				
				
			}
			else{
				  count++;
				  pReplaceString = pReplaceString + splitString[i] + count +" ";
			}
			
			
		
		}
		
		
	
			
        return pReplaceString;
			
	}
		
}


