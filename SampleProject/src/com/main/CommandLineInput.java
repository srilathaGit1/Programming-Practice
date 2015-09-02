package com.main;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CommandLineInput {
	
	public void isScanner(){
		System.out.println("please Enter your Name:");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println("You entered "+ line);
		
	}
	public static void main(String[] args){
      CommandLineInput cmd = new CommandLineInput();
      cmd.isScanner();
	}

}
