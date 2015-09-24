package com.main;

public class NullPointerException {
	
	public void exceptionHandler() throws Exception{
	
		try{
			String str = null;
			if(str.length()>0){
				
			}
			 
			 
		}
		
		catch(Exception e){
			//
			e.printStackTrace();
			throw e;
		}
		
		finally{
			System.out.println("came here finally");
			
		}
			
		
	
		
	}

}
