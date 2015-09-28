package com.main;

public class Person {
	
 private int employeeId;
 private String firstName;
 private String lastName;
 
 public void setEmployeeId(int pEmployeeId){
	 this.employeeId = pEmployeeId;
 }
 
 public int getEmployeeId(){
	 return employeeId;
 }
 
 public void setFirstName(String pFirstName){
	 this.firstName = pFirstName;
 }
 public String getFirstName(){
	 return firstName;
 }
 
 public void setLastName(String pLastName){
	 this.lastName = pLastName;
 }
 
 public String getLastName(){
	 return lastName;
 }
 
 public String getDisplayName(){
	 return firstName+ " " +lastName;
 }
}
