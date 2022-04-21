<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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