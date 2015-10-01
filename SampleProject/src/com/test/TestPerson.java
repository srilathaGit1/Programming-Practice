package com.test;

import org.testng.annotations.Test;

import com.main.Person;

public class TestPerson {
  @Test
  public void testPerson() {
	  int employeeId = 167;
	  String firstName = "Amit";
	  String lastName = "Banda";
	
	  Person per1 = new Person();
	  per1.setEmployeeId(employeeId);
	  per1.setFirstName(firstName);
	  per1.setLastName(lastName);
	   int code = per1.hashCode();
	   System.out.println(code);
	   
	   Person per2 = new Person();
	   per2.setEmployeeId(employeeId);
	   per2.setFirstName(firstName);
	   per2.setLastName(lastName);
	   int code1 = per2.hashCode();
	   System.out.println(code1);
	   
	   System.out.println(per1.equals(per2));
	  
	  
	  
  }
  
  
}
