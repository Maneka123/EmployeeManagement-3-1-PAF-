<%     
if (request.getParameter("firstname") != null) 
{ 
 session.setAttribute("firstname", request.getParameter("firstname")); 
 session.setAttribute("lastname", request.getParameter("lastname")); 
 session.setAttribute("date", request.getParameter("date")); 
 session.setAttribute("gender", request.getParameter("gender")); 
 session.setAttribute("fatherName", request.getParameter("fatherName")); 
 session.setAttribute("motherName", request.getParameter("motherName")); 
 session.setAttribute("designation", request.getParameter("designation")); 
 session.setAttribute("department", request.getParameter("department")); 
} 
    
    if (request.getParameter("a") != null) 
    { 
     session.setAttribute("a", request.getParameter("a")); 
     session.setAttribute("b", request.getParameter("b")); 
     session.setAttribute("c", request.getParameter("c")); 
     session.setAttribute("d", request.getParameter("d")); 
     session.setAttribute("e", request.getParameter("ee")); 
     session.setAttribute("f", request.getParameter("f")); 
     session.setAttribute("g", request.getParameter("g")); 
     session.setAttribute("h", request.getParameter("ht")); 
    }%>
 




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
 <h1>Official Information</h1>
  <input type="text" id="fname" name="firstname" placeholder="Your first name.."><br>
  <input type="text" id="lname" name="lastname" placeholder="Your last name.."><br>
  <input type="date" id="myDate" name="date" ><br>
  <input type="text" id="myGender" name="gender" placeholder="Your gender"><br>
  <input type="text" id="myFather" name="fatherName" placeholder="Your father's name.."><br>
  <input type="text" id="myMother" name="motherName" placeholder="Your mother's name.."><br>
  <input type="text" id="myDesignation" name="designation" placeholder="Your designation"><br>
  <input type="text" id="myDept" name="department" placeholder="Your department name.."><br>
 
  <input type="submit" value="Submit">
</form> <br>


<form >
 <h1>Contact Information</h1>
  <input type="text" id="cAddr" name="a" placeholder="Your current address"><br>
  <input type="text" id="pAddr" name="b" placeholder="Your permanent address.."><br>
  <input type="email" id="eEmail" name="c" placeholder="tour email..."><br>
  <input type="text" id="myContact" name="d" placeholder="Your contact"><br>
  <input type="text" id="myEdu" name="e" placeholder="Your highest education.."><br>
  <input type="text" id="myLang" name="f" placeholder="Language you know.."><br>
  <input type="text" id="myPrimary" name="g" placeholder="Primary skills "><br>
  <input type="text" id="mySecondary" name="h" placeholder="Your secondary skills"><br>
 
  <input type="submit" value="Submit">
</form> <br>



<h1>Contact Details</h1>
<table border="1">
 <tr>
 <th>Temporary address</th> 
<th>Permanent Address</th> 
<th>email</th> 
<th>Contact Number</th> 
 <th>Higher Education</th> 
<th>Language</th> 
<th>Primary Skills</th> 
<th>Secondary Skills</th>
<th>Update</th> 
<th>Remove</th>
 </tr>
 <tr>
 <td><%out.print(session.getAttribute("a")); %></td>
 <td><%out.print(session.getAttribute("b")); %></td>
 <td><%out.print(session.getAttribute("c")); %></td>
 <td><%out.print(session.getAttribute("d")); %></td>
 <td><%out.print(session.getAttribute("e")); %></td>
 <td><%out.print(session.getAttribute("f")); %></td>
 <td><%out.print(session.getAttribute("g")); %></td>
 <td><%out.print(session.getAttribute("h")); %></td>
 <td><input name="btnUpdate" type="button" value="Update"></td>
 <td><input name="btnRemove" type="button" value="Remove"></td>
 </tr>
</table>




<h1>Official Details</h1>
<table border="1">
 <tr>
 <th>First Name</th> 
<th>Last Name</th> 
<th>Date</th> 
<th>Gender</th> 
 <th>Father</th> 
<th>Mother</th> 
<th>Designation</th> 
<th>Deartment</th>
<th>Update</th> 
<th>Remove</th>
 </tr>
 <tr>
 <td><%out.print(session.getAttribute("firstname")); %></td>
 <td><%out.print(session.getAttribute("lastname")); %></td>
 <td><%out.print(session.getAttribute("date")); %></td>
 <td><%out.print(session.getAttribute("gender")); %></td>
 <td><%out.print(session.getAttribute("fatherName")); %></td>
 <td><%out.print(session.getAttribute("motherName")); %></td>
 <td><%out.print(session.getAttribute("designation")); %></td>
 <td><%out.print(session.getAttribute("department")); %></td>
 <td><input name="btnUpdate" type="button" value="Update"></td>
 <td><input name="btnRemove" type="button" value="Remove"></td>
 </tr>
</table>
</body>
</html>