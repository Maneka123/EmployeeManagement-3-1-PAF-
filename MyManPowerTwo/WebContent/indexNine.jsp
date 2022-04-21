
<%     
if (request.getParameter("i") != null) 
{ 
 session.setAttribute("r", request.getParameter("r")); 
 session.setAttribute("s", request.getParameter("s")); 
 session.setAttribute("t", request.getParameter("t")); 
 session.setAttribute("u", request.getParameter("u")); 
 session.setAttribute("v", request.getParameter("v")); 
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
 <h1>TimeSheet Information</h1>
  <input type="email" id="ta" name="r" placeholder="Employee Email"><br>
  <input type="text" id="tb" name="s" placeholder="work title"><br>
  <textarea type="date" id="tc" name="t" placeholder="work description"></textarea><br>
  <input type="number" id="td" name="u" placeholder="total working hours"><br>
  <input type="date" id="td" name="v" ><br>
 
  <input type="submit" value="Submit">
</form> <br>


</body>
</html>