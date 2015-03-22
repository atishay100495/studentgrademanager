<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="bootstrap/grayscale/bootstrap.css" rel="stylesheet">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>StudentRegistrationDetails</title>
  </head>
  <body>
  
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
  
  <c:forEach var="StudentRegistrationDetails" items="${list}">
  <tr>
  <td><c:out value="${StudentRegistrationDetails.firstname}"/></td>
  <td><c:out value="${StudentRegistrationDetails.lastname}"/></td>
  <td><c:out value="${StudentRegistrationDetails.studentGender}"/></td>
  <td><c:out value="${StudentRegistrationDetails.collegeID}"/></td>
  <td><c:out value="${StudentRegistrationDetails.studentEmail}"/></td>
  <td><c:out value="${StudentRegistrationDetails.studentBranch}"/></td>
  <td><c:out value="${StudentRegistrationDetails.addressLine1}"/></td>
  <td><c:out value="${StudentRegistrationDetails.addressLine2}"/></td>
  <td><c:out value="${StudentRegistrationDetails.city}"/></td>
  <td><c:out value="${StudentRegistrationDetails.state}"/></td>
  <td><c:out value="${StudentRegistrationDetails.pincode}"/></td>
  <td><c:out value="${StudentRegistrationDetails.studentPhone}"/></td>
  <td><c:out value="${StudentRegistrationDetails.studentPercentMarks}"/></td>
  </tr>
  </c:forEach>
  
  </table>
  
  <br><br><br>
        <a href="RegisterStudent.jsp">Register Another Student</a>
        <br>
        <a href="StudentLogin.jsp">Student Login</a>
  
  </body>
</html>