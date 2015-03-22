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
      <title>fail</title>
    </head>
    <body>
      <h:form binding="#{FailBean.form1}" id="form1">
        <h:outputText value="Login Failed..." binding="#{FailBean.outputText1}"
                      id="outputText1"/>
      </h:form>
    </body>
  </html>
</f:view>
<%-- 
  oracle-jdev-comment:auto-binding-backing-bean-name:FailBean
--%>