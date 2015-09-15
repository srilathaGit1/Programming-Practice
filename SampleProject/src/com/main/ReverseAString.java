package com.main;

public class ReverseAString {
	
	public String toReverseAString(String pstr){
		char[] rev = pstr.toCharArray();
	    char[] rev1 = new char[rev.length];
	    int reverse= rev1.length-1;
	    
	    for(int i=0; i<=reverse; i++)	{
	    	rev1[i] =rev[reverse-i];
	    }
	    return new String(rev1);
	}


	}

	
	

	




