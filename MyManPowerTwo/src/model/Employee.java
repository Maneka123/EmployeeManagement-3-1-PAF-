package model;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Employee {

	public Connection connect() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/manpower", "root", "");
			// For testing
			System.out.print("Successfully connected");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	// code to insert item to mysql database
	public String insertItemOne(String f, String l, String d, String g,String fa,String m,String de,String dep)
	{ 
	 String output = ""; 

	try
	 { 
	 Connection con = connect(); 
	 if (con == null) 
	 { 
	 return "Error while connecting to the database"; 
	 } 
	 // create a prepared statement
	 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
	 String query = " insert into cusofficial(`fName`,`lName`,`date`,`gender`,`father`,`mother`,`designation`,`department`) "+"values (?,?,?,?,?,?,?,?)"; 
	 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
	 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
	 // binding values
	 //remeber index starts with a zero
	 preparedStmt.setString(1, f); 
	 preparedStmt.setString(2, l); 
	 preparedStmt.setString(3, d); 
	 preparedStmt.setString(4, g); 
	 preparedStmt.setString(5, fa); 
	 preparedStmt.setString(6, m);
	 preparedStmt.setString(7, de);
	 preparedStmt.setString(8, dep);
	 
	 //execute the statement
	 preparedStmt.execute(); 
	 con.close(); 
	 output = "Inserted successfully"; 
	 } 
	catch (Exception e) 
	 { 
	 output = "Error while inserting"; 
	 System.err.println(e.getMessage()); 
	 } 
	return output; 
	}
	
	
	
	
	// code to insert item to mysql database
		public String insertEmpTwo(String f, String l, String d, String g,String fa,String m,String de,String dep)
		{ 
		 String output = ""; 

		try
		 { 
		 Connection con = connect(); 
		 if (con == null) 
		 { 
		 return "Error while connecting to the database"; 
		 } 
		 // create a prepared statement
		 //there are two apostrophes in the keyboard.Only using the left hand side apostrophe yields the correct output
		 String query = " insert into cuscontact(`cAddr`,`pAddr`,`email`,`cNum`,`highEdu`,`language`,`pSkill`,`sSkill`) "+"values (?,?,?,?,?,?,?,?)"; 
		 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
		 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
		 // binding values
		 //remeber index starts with a zero
		 preparedStmt.setString(1, f); 
		 preparedStmt.setString(2, l); 
		 preparedStmt.setString(3, d); 
		 preparedStmt.setString(4, g); 
		 preparedStmt.setString(5, fa); 
		 preparedStmt.setString(6, m);
		 preparedStmt.setString(7, de);
		 preparedStmt.setString(8, dep);
		 
		 //execute the statement
		 preparedStmt.execute(); 
		 con.close(); 
		 output = "Inserted contact details successfully"; 
		 } 
		catch (Exception e) 
		 { 
		 output = "Error while inserting"; 
		 System.err.println(e.getMessage()); 
		 } 
		return output; 
		}
	
	
	
	
	
	
	
	

}
