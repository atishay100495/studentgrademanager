<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<link href="bootstrap/grayscale/bootstrap.css" rel="stylesheet">
<f:view>
  <html>
    <head>
      <meta http-equiv="Content-Type"
            content="text/html; charset=windows-1252"/>
      <title>WelcomePage</title>
    </head>
    <body>
      <h:form id="welcomeform">
        <h:panelGrid columns="1">
          <h:outputLabel value="WELCOME"
                         style="font-weight:bold; font-size:medium;"/>
        </h:panelGrid>
        
        <h:panelGrid columns="1">
          <a href="RegisterAdmin.jsp">Admin Registration</a>
        </h:panelGrid>
        
        <h:panelGrid columns="1">
          <a href="RegisterStudent.jsp">Student Registration</a>
        </h:panelGrid>
        
        <h:panelGrid columns="1">
          <a href="AdminLogin.jsp">Admin Login</a>
        </h:panelGrid>
        
        <h:panelGrid columns="1">
          <a href="StudentLoginSession.html">Student Login</a>
        </h:panelGrid>
        
      </h:form>
    </body>
  </html>
</f:view>