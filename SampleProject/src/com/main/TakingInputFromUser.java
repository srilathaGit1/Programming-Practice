package com.main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInputFromUser {
	
	public void inputFromUser(){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = i+j;
		System.out.println("You entered "+k);
		
	}
	
	public void substractInteger() throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String input = read.readLine();
		String[] numbers =input.split(" ");
		int i = Integer.parseInt(numbers[0]);
		int j = Integer.parseInt(numbers[1]);
		int k = i-j;
		System.out.println("Substracted value" + k);
		
	}
	
	public void substractIntegerUsingDataInputStream() throws Exception {
		DataInputStream read = new DataInputStream(System.in);
		String input = read.readLine();
		String[] numbers =input.split(" ");
		int i = Integer.parseInt(numbers[0]);
		int j = Integer.parseInt(numbers[1]);
		int k = i-j;
		System.out.println("Substracted value" + k);
		
	}
	
	public static void main(String[] args) throws Exception {
		TakingInputFromUser scanner = new TakingInputFromUser();
		//scanner.inputFromUser();
		//scanner.substractInteger();
		//scanner.substractIntegerUsingDataInputStream();
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		double  k = i / j;
		System.out.println("Substracted value using console" + k);
	}

}
