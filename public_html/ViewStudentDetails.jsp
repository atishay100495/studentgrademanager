<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<link href="bootstrap/grayscale/bootstrap.css" rel="stylesheet">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>ViewStudentDetails</title>
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
  <th><b>PASSWORD</b></th>
  </tr>
  
  <c:forEach var="ViewStudentDetails" items="${list}">
  <tr>
  <td><c:out value="${ViewStudentDetails.firstname}"/></td>
  <td><c:out value="${ViewStudentDetails.lastname}"/></td>
  <td><c:out value="${ViewStudentDetails.studentGender}"/></td>
  <td><c:out value="${ViewStudentDetails.collegeID}"/></td>
  <td><c:out value="${ViewStudentDetails.studentEmail}"/></td>
  <td><c:out value="${ViewStudentDetails.studentBranch}"/></td>
  <td><c:out value="${ViewStudentDetails.addressLine1}"/></td>
  <td><c:out value="${ViewStudentDetails.addressLine2}"/></td>
  <td><c:out value="${ViewStudentDetails.city}"/></td>
  <td><c:out value="${ViewStudentDetails.state}"/></td>
  <td><c:out value="${ViewStudentDetails.pincode}"/></td>
  <td><c:out value="${ViewStudentDetails.studentPhone}"/></td>
  <td><c:out value="${ViewStudentDetails.studentPercentMarks}"/></td>
  <td><c:out value="${ViewStudentDetails.studentPassword}"/></td>
  </tr>
  </c:forEach>
  
  </table>
     <br><br>
  <a href="successLoginAdmin.jsp">Go to Update Student Details Page</a>
  </body>
</html>