package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCConnection {

	String DB_CONNECTION = "jdbc:oracle:thin:@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:ORCL";
	String DB_USERNAME = "hr";
	String DB_PASSWORD = "hr123";

	Connection dbConnection = null;

	public ArrayList<Person> connectionToDataBase() throws Exception {
		String SQL = "select employee_id, first_name, last_name from employees";

		ArrayList<Person> names = new ArrayList<Person>();

		try

		{
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USERNAME, DB_PASSWORD);

			PreparedStatement preparedStatement = dbConnection.prepareStatement(SQL);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				int employee_id = rs.getInt(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString(3);
				Person person = new Person();
				person.setFirstName(first_name);
				person.setLastName(last_name);
				person.setEmployeeId(employee_id);
				names.add(person);
				//System.out.println("employeeid: " + employee_id + " firstName:" + first_name + " lastName:" + last_name);

			}
		}

		catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (dbConnection != null) {
				dbConnection.close();
			}
			
		}
		return names;

	}

	public Person  getEmployeeIdOnly(int pEmployeeId, String pLastName) throws Exception{

		String sql = "Select employee_id, first_name, last_name from employees  where employee_id=? and upper(last_name) like '%'||upper(?)||'%' ";
		Person person = new Person();
		try{


			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USERNAME, DB_PASSWORD);
			PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
			preparedStatement.setInt(1, pEmployeeId);
			preparedStatement.setString(2, pLastName);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				int employee_id = rs.getInt(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString(3);
				person.setFirstName(first_name);
				person.setLastName(last_name);
				person.setEmployeeId(employee_id);

			}
		}

		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			if(dbConnection!=null){
				dbConnection.close();
			}
		}
		return person;
	}
}
