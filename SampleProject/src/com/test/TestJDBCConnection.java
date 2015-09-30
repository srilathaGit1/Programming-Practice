package com.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.JDBCConnection;
import com.main.Person;

public class TestJDBCConnection<LastName> {
	 
  @Test
  public void testJDBCConnection() throws Exception {
	  JDBCConnection connection = new JDBCConnection();
	  ArrayList<Person> getNames = connection.connectionToDataBase();
	  for(int i=0; i<getNames.size(); i++){
		  Person var1 = getNames.get(i);
		  System.out.println(var1.getDisplayName() + var1.getEmployeeId());
		  
	  }
	 
 
    	
    	
    	
    }
	  
	  
	  
  
@Test
 public void testGettingEmployeeData() throws Exception {
	 
	 JDBCConnection connect = new JDBCConnection();
	 String lastName = "ing";
	 int employeeId = 100;
	 
	 Person person = connect.getEmployeeIdOnly(employeeId, lastName);
	 Assert.assertEquals(person.getLastName().toLowerCase(), "King".toLowerCase());
			 
	 
	
	
	
}

@Test
public void testUpdateExample() throws Exception{
	JDBCConnection connect = new JDBCConnection();
	String firstName = "Steven";
	int age = 38;
    connect.updateExample(age, firstName);
    
}

@Test
public void testInsertEmployeeDate() throws Exception{
	    JDBCConnection connection = new JDBCConnection();
		int age = 35;
		String fName = "Steven";
	    connection.insertIntoEmployees(age, fName);
		
	}
	
}


