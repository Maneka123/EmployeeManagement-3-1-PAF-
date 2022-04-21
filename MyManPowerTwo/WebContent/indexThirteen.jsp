<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>TimeSheet Details</h1>
<table border="1">
 <tr>
 <th>Email</th> 
<th>Work Title</th> 
<th>Work Description</th> 
<th>Total working hours</th> 
 <th>Date</th>
<th>Update</th> 
<th>Remove</th>
 </tr>
 <tr>
 <td><%out.print(session.getAttribute("r")); %></td>
 <td><%out.print(session.getAttribute("s")); %></td>
 <td><%out.print(session.getAttribute("t")); %></td>
 <td><%out.print(session.getAttribute("u")); %></td>
 <td><%out.print(session.getAttribute("v")); %></td>
 <td><input name="btnUpdate" type="button" value="Update"></td>
 <td><input name="btnRemove" type="button" value="Remove"></td>
 </tr>
</table>


</body>
</html>