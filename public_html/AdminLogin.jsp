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
      <title>AdminLogin</title>
    </head>
    <body>
      <h:form>
        <h:outputText value="ADMIN LOGIN"
                      binding="#{AdminLoginBean.adminloginoutputtext}"
                      style="font-weight:bold; font-size:medium;"/>
        <br><br><br>
        <h:panelGrid columns="2">
          <h:outputLabel value="Username:"
                         binding="#{AdminLoginBean.usernamelabel}"/>
          <h:inputText id="usernamebox"
                       binding="#{AdminLoginBean.usernameinputtext}"/>
        </h:panelGrid>
        <h:panelGrid columns="2">
          <h:outputLabel value="Password:"
                         binding="#{AdminLoginBean.passwordlabel}"/>
          <h:inputSecret id="passwordbox"
                         binding="#{AdminLoginBean.passwordinputsecret}"/>
        </h:panelGrid>
        <h:panelGrid columns="2">
          <h:commandButton value="Login"
                           binding="#{AdminLoginBean.logincommandbutton}"
                           action="#{AdminLoginBean.login_action}"/>
        </h:panelGrid>
        <br>
        <a href="RegisterAdmin.jsp">Not Registered? Click here to REGISTER</a>
        <br>
        <a href="WelcomePage.jsp">Go to Start Page</a>
        
      </h:form>
    </body>
  </html>
</f:view>