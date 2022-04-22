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
	
	
		// code to insert item to mysql database
				public String insertSalary(String f, String l, String d, String g)
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
				 String query = " insert into salary(`email`,`month`,`year`,`amount`) "+"values (?,?,?,?)"; 
				 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 //remeber index starts with a zero
				 preparedStmt.setString(1, f); 
				 preparedStmt.setString(2, l); 
				 preparedStmt.setString(3, d); 
				 preparedStmt.setString(4, g); 
				 
				 //execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Inserted salary details successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while inserting"; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
			
	
	
				// code to insert item to mysql database
				public String insertLeave(String f, String l, String d, String g,String h)
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
				 String query = " insert into cusleave(`empEmail`,`leaveDescription`,`fromLeave`,`toLeave`,`leaveStatus`) "+"values (?,?,?,?,?)"; 
				 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 //remeber index starts with a zero
				 preparedStmt.setString(1, f); 
				 preparedStmt.setString(2, l); 
				 preparedStmt.setString(3, d); 
				 preparedStmt.setString(4, g); 
				 preparedStmt.setString(5, h); 
				 //execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Inserted leave details successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while inserting"; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
			
				// code to insert item to mysql database
				public String insertTimesheet(String f, String l, String d, String g,String h)
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
				 String query = " insert into timesheet(`cusEmail`,`workTitle`,`workDescription`,`totalWorkHrs`,`date`) "+"values (?,?,?,?,?)"; 
				 //java.sql.PreparedStatement preparedStmt =  con.prepareStatement(query); 
				 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query); 
				 // binding values
				 //remeber index starts with a zero
				 preparedStmt.setString(1, f); 
				 preparedStmt.setString(2, l); 
				 preparedStmt.setString(3, d); 
				 preparedStmt.setString(4, g); 
				 preparedStmt.setString(5, h); 
				 //execute the statement
				 preparedStmt.execute(); 
				 con.close(); 
				 output = "Inserted timesheet details successfully"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while inserting"; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}
	
				
				public String readOfficialDetails()
				{ 
				 String output = ""; 
				try
				 { 
				 Connection con = connect(); 
				 if (con == null) 
				 { 
				 return "Error while connecting to the database for reading."; 
				 } 
				 // Prepare the html table to be displayed
				 output = "<table border='1'><tr><th>First Name</th>" 
				 +"<th>Last Name</th>"+"<th>Date</th>"
				 + "<th>Gender</th>" +"<th>father</th>"+"<th>mother</th>"+"<th>designation</th>"+"<th>Department</th>"
				 + "<th>Update</th><th>Remove</th></tr>"; 
				 String query = "select * from cusofficial"; 
				 Statement stmt = con.createStatement(); 
				 ResultSet rs = stmt.executeQuery(query); 
				 // iterate through the rows in the result set
				 while (rs.next()) 
				 { 
				 //String itemID = Integer.toString(rs.getInt("itemID")); 
				 String a = rs.getString("fName"); 
				 String b = rs.getString("lName"); 
				 String c = rs.getString("date"); 
				 String d = rs.getString("gender"); 
				 String e = rs.getString("father"); 
				 String f= rs.getString("mother"); 
				 String g = rs.getString("designation"); 
				 String h = rs.getString("department"); 
				 //String itemPrice = Double.toString(rs.getDouble("itemPrice")); 
				 
				 // Add a row into the html table
				 output += "<tr><td>" + a + "</td>"; 
				 output += "<td>" + b + "</td>"; 
				output += "<td>" + c + "</td>";
				 
				output += "<td>" +d + "</td>"; 
				output += "<td>" +e+ "</td>"; 
				output += "<td>" +f + "</td>"; 
				output += "<td>" +g+ "</td>"; 
				output += "<td>" +h + "</td>"; 
				 // buttons
				 output += "<td><input name='btnUpdate' " 
				 + " type='button' value='Update'></td>"
				 + "<td><form method='post' action='indexFourteen.jsp'>"
				 + "<input name='btnRemove' " 
				 + " type='submit' value='Remove'>"
				 + "<input name='itemID' type='hidden' " 
				 + " value='" +001 + "'>"+ "</form></td></tr>"; 
				 } 
				 con.close(); 
				 // Complete the html table
				 output += "</table>"; 
				 } 
				catch (Exception e) 
				 { 
				 output = "Error while reading the items."; 
				 System.err.println(e.getMessage()); 
				 } 
				return output; 
				}

}
