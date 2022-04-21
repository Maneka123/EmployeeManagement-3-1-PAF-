<%     
if (request.getParameter("i") != null) 
{ 
 session.setAttribute("i", request.getParameter("i")); 
 session.setAttribute("j", request.getParameter("j")); 
 session.setAttribute("k", request.getParameter("k")); 
 session.setAttribute("l", request.getParameter("l")); 
 
} 
    
   
 %>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form >
 <h1>Salary Information</h1>
  <input type="text" id="myEmail" name="i" placeholder="Your email.."><br>
  <input type="text" id="myMonth" name="j" placeholder="Your month.."><br>
  <input type="date" id="myYear" name="k" ><br>
  <input type="text" id="myAmount" name="l" placeholder="Your amount"><br>
  
 
  <input type="submit" value="Submit">
</form> <br>






<h1>Salary Details</h1>
<table border="1">
 <tr>
 <th>Email</th> 
<th>Month</th> 
<th>Year</th> 
<th>Amount</th> 
 
<th>Update</th> 
<th>Remove</th>
 </tr>
 <tr>
 <td><%out.print(session.getAttribute("i")); %></td>
 <td><%out.print(session.getAttribute("j")); %></td>
 <td><%out.print(session.getAttribute("k")); %></td>
 <td><%out.print(session.getAttribute("l")); %></td>
 
 <td><input name="btnUpdate" type="button" value="Update"></td>
 <td><input name="btnRemove" type="button" value="Remove"></td>
 </tr>
</table>





</body>
</html>