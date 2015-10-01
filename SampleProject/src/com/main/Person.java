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
 // private modifier only accessible with in the class.
 private int getEmployeeSSN(){
	 return 123445;
 }
 //protected modifier can be accessible outside of the package only by inheritance.
 protected String getCountryName(){
	 return "India";
 }
 //default modifier cannot access outside of the package. Only accessible within the package.
 String getCityName(){
	 return "Hyderabad";
	 
	  }
 public int hashCode(){
	 return employeeId;
	
	 
 }
 
  public boolean equals(Person test){
	  if(this.getEmployeeId() == test.getEmployeeId()){
		  return true;
	  }
	  return false;
  }
 
}
