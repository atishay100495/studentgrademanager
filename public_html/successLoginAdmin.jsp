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
      <title>successLoginAdmin</title>
    </head>
    <body>
      <h:form>
      <h:outputText value="Admin Login Successful..."
                    id="adminloginsuccesslabel"
                    binding="#{AdminLoginSuccessBean.adminloginsuccesslabel}"/>
      <br>
      <br>
        <h:panelGrid columns="2">
          <h:outputLabel value="Enter Student ID:"
                         binding="#{AdminLoginSuccessBean.studentidlabel}"/>
          <h:inputText id="studentidbox"
                       binding="#{AdminLoginSuccessBean.studentidbox}"/>
        </h:panelGrid>
        <h:panelGrid columns="2">
          <h:commandButton value="Update Student Details"
                           binding="#{AdminLoginSuccessBean.updatestudentdetailscommandbutton}"
                           action="#{AdminLoginSuccessBean.updatestudentdetails_action}"/>
          <h:commandButton value="Delete Record"
                           binding="#{AdminLoginSuccessBean.deleterecordcommandbutton}"
                           action="#{AdminLoginSuccessBean.deleterecord_action}"/>
        </h:panelGrid>
        <h:panelGrid columns="2">
          <a href="ViewStudentDetails">View All Students</a>
          <br>
          <a href="ViewSortedList">View Sorted List of Students</a>
        </h:panelGrid>
        <h:panelGrid columns="1">
          <a href="AdminLogin.jsp">Logout</a>
        </h:panelGrid>
      </h:form>
    </body>
  </html>
</f:view>