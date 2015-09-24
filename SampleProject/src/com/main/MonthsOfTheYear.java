package com.main;

public class MonthsOfTheYear {

	private enum Month{
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST, 
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECEMBER
	}
	
	public void printEnum(){
		for(Month singleMonth: Month.values()) { 
			System.out.println(singleMonth.name());
		}
	
	}
	
}
