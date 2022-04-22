

<%//Delete item----------------------------------
if (request.getParameter("itemID") != null) 
{ 
Employee itemObj = new Employee(); 
String stsMsg = itemObj.deleteLeave(request.getParameter("itemID")); 
session.setAttribute("statusMsgEight",stsMsg); 
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

<h1>Leave details from database</h1>

<%
 Employee itemObj = new Employee(); 
 out.print(itemObj.readLeaveDetails()); 
%>

<%
 out.print(session.getAttribute("statusMsgEight")); 
%>
</body>
</html>