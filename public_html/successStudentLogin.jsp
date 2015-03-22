<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<link href="bootstrap/grayscale/bootstrap.css" rel="stylesheet">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>successStudentLogin</title>
  </head>
  <body>
    <%
//allow access only if session exists
String user = null;
if(session.getAttribute("user") == null){
	response.sendRedirect("StudentLoginSession.html");
}else user = (String) session.getAttribute("user");
String userName = user;
String sessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) userName = cookie.getValue();
	if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
}
}
%>
     
    <h4>
      Hi
      <%=userName %>
      , Login successful. Your Session ID=
      <%=sessionID %>
    </h4>
     
    <br></br>
     User=<%=user %>
     
    <br></br>
     
    <form action="StudentLogoutServlet" method="post">
      <input type="submit" value="Logout"></input>
    </form>
    
    <br><br><br>
        <a href="StudentDetails">Get Student Details</a>
  </body>
</html>