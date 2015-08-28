package com.main;

//Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
//and "ping pong" if number is divisible by both, else print the number.
public class Ping {

	int ping;

	public  String  isPrintPing(int pPing){
		this.ping = pPing;
	
	if(ping%3==0&&ping%5==0)	{
		return("ping pong");
		
	}
	else{
		if(ping%5==0){
			return("pong");
		
		}
	
		else{
			if(ping%3==0){
				return("ping");
				
			}
		}
	 }
	StringBuilder sb = new StringBuilder();
	sb.append("ping");
	String str1 = sb.toString();
	return (str1);
	 
	}
	

	public static String isPrintPing1(int ping) {
		if (ping % 3 == 0 && ping % 5 == 0) {
			return ("ping pong");

			//System.out.println("pingpong");

		}else{
			if(ping%3==0){
				
			}else{
				if(ping%5==0){
					
				}
						
				
				
				
			}
			String str1 = Integer.toString(ping);
			
		return ("str1");
	
		}

	}

}
