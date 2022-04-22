
<%//Delete item----------------------------------
if (request.getParameter("itemID") != null) 
{ 
Employee itemObj = new Employee(); 
String stsMsg = itemObj.deleteItemTwo(request.getParameter("itemID")); 
session.setAttribute("statusMsgSix",stsMsg); 
}  %>




<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Customer Contact details from database</h1>

<%
 Employee itemObj = new Employee(); 
 out.print(itemObj.readContactDetails()); 
%>



<%
 out.print(session.getAttribute("statusMsgSix")); 
%>

</body>
</html>