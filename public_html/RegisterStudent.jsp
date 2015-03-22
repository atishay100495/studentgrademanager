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
      <title>RegisterStudent</title>
    </head>
    <body>
      <h:form id="registerstudentform">
      <h:panelGrid columns="2" binding="#{RegisterBean.panelGridTop}">
      <h:outputLabel value="STUDENT REGISTRATION FORM"
                     style="font-size:medium; font-weight:bold;"
                     binding="#{RegisterBean.toplabel}"/>
      </h:panelGrid>
      <br>
        <h:panelGrid columns="3" binding="#{RegisterBean.panelgridmiddle}">
          <h:outputLabel value="First Name:"
                         binding="#{RegisterBean.firstnamelabel}"/>
          <h:inputText id="firstnamebox" binding="#{RegisterBean.firstnamebox}" required="true" requiredMessage="Name cannot be left blank">
          <f:validator validatorId="NameValidator"/>
          </h:inputText><h:message style="color:red;" for="firstnamebox"/>
          
          <h:outputLabel value="Last Name:"
                         binding="#{RegisterBean.lastnamelabel}"/>
          <h:inputText id="lastnamebox" binding="#{RegisterBean.lastnamebox}" required="true" requiredMessage="Name cannot be left blank">
          <f:validator validatorId="NameValidator"/>
          </h:inputText><h:message style="color:red;" for="lastnamebox"/>
          
          <h:outputLabel value="Gender:" binding="#{RegisterBean.genderlabel}"/>
            <h:selectOneMenu binding="#{RegisterBean.genderdropdownmenu}"
                             id="genderdropdownmenu">
            <f:selectItem itemValue="male" itemLabel="Male" />
            <f:selectItem itemValue="female" itemLabel="Female" />
            <f:validator validatorId="GenderValidator"/>
            </h:selectOneMenu><h:message style="color:red;" for="genderdropdownmenu"/>
          
          <h:outputLabel value="College ID:"
                         binding="#{RegisterBean.collegeidlabel}"/>
          <h:inputText id="collegeidbox" binding="#{RegisterBean.collegeidbox}" required="true" requiredMessage="College ID cannot be left blank">
          <f:validator validatorId="CollegeIDValidator"/>
          </h:inputText><h:message style="color:red;" for="collegeidbox"/>
          
          <h:outputLabel value="EMail:" binding="#{RegisterBean.emaillabel}"/>
          <h:inputText id="emailbox" binding="#{RegisterBean.emailbox}" required="true" requiredMessage="EMail cannot be left blank">
          <f:validator validatorId="EmailValidator"/>
          </h:inputText><h:message style="color:red;" for="emailbox"/>
          
          <h:outputLabel value="Branch:" binding="#{RegisterBean.branchlabel}"/>
          <h:inputText id="branchbox" binding="#{RegisterBean.branchbox}" required="true" requiredMessage="Branch cannot be left blank">
          <f:validator validatorId="BranchValidator"/>
          </h:inputText><h:message style="color:red;" for="branchbox"/>
          
          <h:outputLabel value="Address Line 1:"
                         binding="#{RegisterBean.addressline1label}"/>
          <h:inputText id="addressline1box"
                       binding="#{RegisterBean.addressline1box}" required="true" requiredMessage="Address cannot be left blank">
           <f:validator validatorId="AddressLineValidator"/>
          </h:inputText><h:message style="color:red;" for="addressline1box"/>
          
          <h:outputLabel value="Address Line 2:"
                         binding="#{RegisterBean.addressline2label}"/>
          <h:inputText id="addressline2box"
                       binding="#{RegisterBean.addressline2box}" required="true" requiredMessage="Address cannot be left blank">
          <f:validator validatorId="AddressLineValidator"/>
          </h:inputText><h:message style="color:red;" for="addressline2box"/>
          
          <h:outputLabel value="City:" binding="#{RegisterBean.citylabel}"/>
          <h:selectOneMenu binding="#{RegisterBean.citydropdownmenu}"
                           id="citydropdownmenu">
            <f:selectItem itemValue="bangalore" itemLabel="Bangalore" />
            <f:selectItem itemValue="chennai" itemLabel="Chennai" />
            <f:selectItem itemValue="delhi" itemLabel="Delhi" />
            <f:selectItem itemValue="kolkata" itemLabel="Kolkata" />
            <f:selectItem itemValue="hyderabad" itemLabel="Hyderabad" />
            <f:selectItem itemValue="mumbai" itemLabel="Mumbai" />
            <f:validator validatorId="CityValidator"/>
          </h:selectOneMenu><h:message style="color:red;" for="citydropdownmenu"/>
            
          
          <h:outputLabel value="State:" binding="#{RegisterBean.statelabel}"/>
          <h:inputText id="statebox" binding="#{RegisterBean.statebox}" required="true" requiredMessage="State cannot be left blank">
          <f:validator validatorId="StateValidator"/>
          </h:inputText><h:message style="color:red;" for="statebox"/>
          
          <h:outputLabel value="Pincode:"
                         binding="#{RegisterBean.pincodelabel}"/>
          <h:inputText id="pincodebox" binding="#{RegisterBean.pincodebox}" required="true" requiredMessage="Pincode cannot be left blank">
          <f:validator validatorId="PincodeValidator"/>
          </h:inputText><h:message style="color:red;" for="pincodebox"/>
          
          <h:outputLabel value="Phone:" binding="#{RegisterBean.phonelabel}"/>
          <h:inputText id="phonebox" binding="#{RegisterBean.phonebox}" required="true" requiredMessage="Phone Number cannot be left blank">
          <f:validator validatorId="PhoneValidator"/>
          </h:inputText><h:message style="color:red;" for="phonebox"/>
          
          <h:outputLabel value="Percent Marks:"
                         binding="#{RegisterBean.percentmarkslabel}"/>
          <h:inputText id="percentmarksbox"
                       binding="#{RegisterBean.percentmarksbox}" required="true" requiredMessage="Please enter your marks">
          <f:validator validatorId="PercentMarksValidator"/>
          </h:inputText><h:message style="color:red;" for="percentmarksbox"/>
          
          <h:outputLabel value="Password:"
                         binding="#{RegisterBean.passwordlabel}"/>
          <h:inputSecret id="passwordbox"
                         binding="#{RegisterBean.passwordinputsecret}" required="true" requiredMessage="Please enter a password">
          <f:validator validatorId="PasswordValidator"/>
          </h:inputSecret><h:message style="color:red;" for="passwordbox"/>
          
          <h:outputLabel value="Confirm Password:"
                         binding="#{RegisterBean.confirmpasswordlabel}"/>
          <h:inputSecret id="confirmpasswordbox"
                         binding="#{RegisterBean.confirmpasswordinputsecret}" required="true" requiredMessage="Confirm Password field cannot be left blank">
          <f:validator validatorId="ConfirmPasswordValidator"/>
          </h:inputSecret><h:message style="color:red;" for="confirmpasswordbox"/>
        </h:panelGrid>
        <h:panelGrid columns="1" binding="#{RegisterBean.panelgridbottom}">
          <h:commandButton value="Register"
                           binding="#{RegisterBean.registercommandbutton}"
                           action="#{RegisterBean.registercommandbutton_action}"/>
        </h:panelGrid>
      </h:form>
    </body>
  </html>
</f:view>