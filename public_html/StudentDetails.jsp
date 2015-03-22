<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="bootstrap/grayscale/bootstrap.css" rel="stylesheet">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>StudentDetails</title>
  </head>
  <body>
   <%
//allow access only if session exists
String user = null;
if(session.getAttribute("user") == null){
	response.sendRedirect("StudentLoginSession.html");
}
else user = (String) session.getAttribute("user");

String userName = user;
String sessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) userName = cookie.getValue();
}
}
%>
     
    <h5>
      Hi
      <%=userName %>
      , Check your details.
    </h5>
     
    <br></br>
  
  
  <table cellspacing="2" cellpadding="2" align="center" border="1">
  <tr>
  <th><b>FIRST NAME</b></th>
  <th><b>LAST NAME</b></th>
  <th><b>GENDER</b></th>
  <th><b>COLLEGE ID</b></th>
  <th><b>EMAIL</b></th>
  <th><b>BRANCH</b></th>
  <th><b>ADDRESS LINE 1</b></th>
  <th><b>ADDRESS LINE 2</b></th>
  <th><b>CITY</b></th>
  <th><b>STATE</b></th>
  <th><b>PINCODE</b></th>
  <th><b>PHONE</b></th>
  <th><b>PERCENT MARKS</b></th>
  </tr>
  
  <c:forEach var="StudentDetails" items="${list}">
  <tr>
  <td><c:out value="${StudentDetails.firstname}"/></td>
  <td><c:out value="${StudentDetails.lastname}"/></td>
  <td><c:out value="${StudentDetails.studentGender}"/></td>
  <td><c:out value="${StudentDetails.collegeID}"/></td>
  <td><c:out value="${StudentDetails.studentEmail}"/></td>
  <td><c:out value="${StudentDetails.studentBranch}"/></td>
  <td><c:out value="${StudentDetails.addressLine1}"/></td>
  <td><c:out value="${StudentDetails.addressLine2}"/></td>
  <td><c:out value="${StudentDetails.city}"/></td>
  <td><c:out value="${StudentDetails.state}"/></td>
  <td><c:out value="${StudentDetails.pincode}"/></td>
  <td><c:out value="${StudentDetails.studentPhone}"/></td>
  <td><c:out value="${StudentDetails.studentPercentMarks}"/></td>
  </tr>
  </c:forEach>
  
  </table>
  <br>
  <!--<a href="StudentLogin.jsp">Back to Login</a>-->
  
  <form action="StudentLogoutServlet" method="post">
      <input type="submit" value="Logout"></input>
    </form>
  </body>
</html>