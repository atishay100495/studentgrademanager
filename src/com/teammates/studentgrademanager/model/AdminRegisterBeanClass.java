package com.teammates.studentgrademanager.model;

import com.teammates.studentgrademanager.service.AdminServiceFacadeImpl;
import com.teammates.studentgrademanager.service.IAdminServiceFacade;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlOutputText;

public class AdminRegisterBeanClass {
    private HtmlOutputText adminregisterlabel;
    private HtmlOutputLabel usernamelabel;
    private HtmlOutputLabel passwordlabel;
    private HtmlInputText usernameinputtext;
    private HtmlInputSecret passwordinputsecret;
    private HtmlCommandButton registercommandbutton;

    public AdminRegisterBeanClass() {
    }


    public Object register_action() {
        // Add event code here...
        String username = usernameinputtext.getValue().toString();
        String password = passwordinputsecret.getValue().toString();
        
        AdminData adminData = new AdminData();
        adminData.setUsername(username);
        adminData.setPassword(password);
        
        IAdminServiceFacade facade = new AdminServiceFacadeImpl();
        boolean result = facade.register(adminData);
        
        if(result==true) {
            return "successRegisterAdmin";
        }
        else {
            return "failRegisterAdmin";
        }
        
    }
    
    public void setAdminregisterlabel(HtmlOutputText adminregisterlabel) {
        this.adminregisterlabel = adminregisterlabel;
    }

    public HtmlOutputText getAdminregisterlabel() {
        return adminregisterlabel;
    }

    public void setUsernamelabel(HtmlOutputLabel usernamelabel) {
        this.usernamelabel = usernamelabel;
    }

    public HtmlOutputLabel getUsernamelabel() {
        return usernamelabel;
    }

    public void setPasswordlabel(HtmlOutputLabel passwordlabel) {
        this.passwordlabel = passwordlabel;
    }

    public HtmlOutputLabel getPasswordlabel() {
        return passwordlabel;
    }

    public void setUsernameinputtext(HtmlInputText usernameinputtext) {
        this.usernameinputtext = usernameinputtext;
    }

    public HtmlInputText getUsernameinputtext() {
        return usernameinputtext;
    }

    public void setPasswordinputsecret(HtmlInputSecret passwordinputsecret) {
        this.passwordinputsecret = passwordinputsecret;
    }

    public HtmlInputSecret getPasswordinputsecret() {
        return passwordinputsecret;
    }

    public void setRegistercommandbutton(HtmlCommandButton registercommandbutton) {
        this.registercommandbutton = registercommandbutton;
    }

    public HtmlCommandButton getRegistercommandbutton() {
        return registercommandbutton;
    }

    
}
