
package com.main;

public class ReplaceSubString {

	public String findSubString(String pOriginalString, String pFindString, String pReplaceString){
		
		return pOriginalString.replace(pFindString,  pReplaceString);
		
	}

	public String findAlternateSubString(String pOriginalString, String pFindString, String pReplaceString){
		
		int index = pOriginalString.indexOf(pFindString);
		System.out.println(index);
		String beforeWord =  pOriginalString.substring(0,index);
		System.out.println(beforeWord);
		String afterWord = pOriginalString.substring(index+pFindString.length());		
	    System.out.println(afterWord);
		return beforeWord + pReplaceString + afterWord;
		
	}

    
}

