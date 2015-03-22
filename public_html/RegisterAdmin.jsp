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
      <title>RegisterAdmin</title>
    </head>
    <body>
      <h:form id="registeradminform">
        <h:outputText value="ADMIN REGISTER"
                      binding="#{AdminRegisterBean.adminregisterlabel}"
                      style="font-weight:bold; font-size:medium;"/>
        <br><br><br>
        <h:panelGrid columns="2">
          <h:outputLabel value="Username:"
                         binding="#{AdminRegisterBean.usernamelabel}"/>
          <h:inputText id="usernamebox"
                       binding="#{AdminRegisterBean.usernameinputtext}"/>
        </h:panelGrid>
        <h:panelGrid columns="2">
          <h:outputLabel value="Password:"
                         binding="#{AdminRegisterBean.passwordlabel}"/>
          <h:inputSecret id="passwordbox"
                         binding="#{AdminRegisterBean.passwordinputsecret}"/>
        </h:panelGrid>
        <h:panelGrid columns="2">
          <h:commandButton value="Register"
                           binding="#{AdminRegisterBean.registercommandbutton}"
                           action="#{AdminRegisterBean.register_action}"/>
        </h:panelGrid>
      </h:form>
    </body>
  </html>
</f:view>