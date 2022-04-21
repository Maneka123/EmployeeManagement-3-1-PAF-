<%     
if (request.getParameter("i") != null) 
{ 
 session.setAttribute("m", request.getParameter("m")); 
 session.setAttribute("n", request.getParameter("n")); 
 session.setAttribute("o", request.getParameter("o")); 
 session.setAttribute("p", request.getParameter("p")); 
 
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
 <h1>Leave Information</h1>
  <input type="text" id="abe" name="m" placeholder="Employee Email"><br>
  <input type="text" id="abl" name="n" placeholder="Leave Description"><br>
  <input type="date" id="abf" name="o" ><br>
  <input type="date" id="abt" name="p" ><br>
   <textarea type="text" id="abl" name="q" placeholder="Leave status"></textarea><br>
 
  <input type="submit" value="Submit">
</form> <br>






<h1>Leave Details</h1>
<table border="1">
 <tr>
 <th>Email</th> 
<th>Leave Description</th> 
<th>From date</th> 
<th>To Date</th> 
 <th>Leave Status</th>
<th>Update</th> 
<th>Remove</th>
 </tr>
 <tr>
 <td><%out.print(session.getAttribute("m")); %></td>
 <td><%out.print(session.getAttribute("n")); %></td>
 <td><%out.print(session.getAttribute("o")); %></td>
 <td><%out.print(session.getAttribute("p")); %></td>
 <td><%out.print(session.getAttribute("q")); %></td>
 <td><input name="btnUpdate" type="button" value="Update"></td>
 <td><input name="btnRemove" type="button" value="Remove"></td>
 </tr>
</table>





</body>
</html>