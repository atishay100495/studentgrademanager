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
      <title>StudentLogin</title>
    </head>
    <body>
    
      <h:form style="text-align:left;" binding="#{LoginBean.form1}" id="form1">
        <h:outputText value="STUDENT LOGIN"
                      style="font-weight:bold; font-size:medium;"/>
        <br><br><br>
        <h:panelGrid columns="2" binding="#{LoginBean.panelGrid3}"
                     id="panelGrid3">
          <h:outputLabel value="User Name:" binding="#{LoginBean.outputLabel2}"
                         id="outputLabel2"/>
          <h:inputText binding="#{LoginBean.inputText1}" id="inputText1"
                       style="text-align:left;"/>
        </h:panelGrid>
        <h:panelGrid columns="2" binding="#{LoginBean.panelGrid2}"
                     id="panelGrid2">
          <h:outputLabel value="Password: " binding="#{LoginBean.outputLabel1}"
                         id="outputLabel1"/>
          <h:inputSecret style="text-align:left;"
                         binding="#{LoginBean.inputSecret1}" id="inputSecret1"/>
        </h:panelGrid>
        <h:panelGrid columns="2" binding="#{LoginBean.panelGrid1}"
                     id="panelGrid1">
          <h:commandButton value="Login"
                           action="#{LoginBean.commandButton_action}"
                           binding="#{LoginBean.commandButton2}"
                           id="commandButton2"/>
          <h:commandButton value="Cancel" binding="#{LoginBean.commandButton1}"
                           id="commandButton1"/>
        </h:panelGrid>
        &nbsp;
        <br>
        <a href="RegisterStudent.jsp">New Student? Click here to REGISTER</a>
        <br>
        <a href="WelcomePage.jsp">Go to Start Page</a>
      </h:form>
    </body>
  </html>
</f:view>
<%-- 
  oracle-jdev-comment:preferred-managed-bean-name:LoginBean
--%>
<%-- 
  oracle-jdev-comment:auto-binding-backing-bean-name:LoginBean
--%>