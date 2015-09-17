package com.main;

public class ReverseEachWord {
	
	public String toReverseAword(String pstr){
		String revSentence = "";
		String[] revWord = pstr.split(" ");
		for(int i=0; i<revWord.length; i++){
			String word = revWord[i];
			String reverseWord = "";
			for(int j=word.length()-1;j>=0;j--){
			   reverseWord = reverseWord+word.charAt(j);
				
				
			}
			if(revSentence.length() >0){
				revSentence = revSentence+" "+reverseWord;
				
			}else{
				revSentence = reverseWord;
			}
			
		}
		return revSentence;
		
		
	}

}
