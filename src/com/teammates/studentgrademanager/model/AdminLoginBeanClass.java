package com.teammates.studentgrademanager.model;

import com.teammates.studentgrademanager.service.AdminServiceFacadeImpl;
import com.teammates.studentgrademanager.service.IAdminServiceFacade;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlOutputText;

public class AdminLoginBeanClass {
    private HtmlOutputText adminloginoutputtext;
    private HtmlOutputLabel usernamelabel;
    private HtmlOutputLabel passwordlabel;
    private HtmlInputText usernameinputtext;
    private HtmlInputSecret passwordinputsecret;
    private HtmlCommandButton logincommandbutton;

    public AdminLoginBeanClass() {
    }


    public Object login_action() {
        // Add event code here...
        
        String username = usernameinputtext.getValue().toString();
        String password = passwordinputsecret.getValue().toString();
        
        //Go to Update Student Details
        IAdminServiceFacade facade = new AdminServiceFacadeImpl();
        boolean result = facade.login(username, password);
        
        if(result==true)
        {
            return "successLoginAdmin";
        }
        else {
            return "failLoginAdmin";
        }
    }
    
    
    public void setAdminloginoutputtext(HtmlOutputText adminloginoutputtext) {
        this.adminloginoutputtext = adminloginoutputtext;
    }

    public HtmlOutputText getAdminloginoutputtext() {
        return adminloginoutputtext;
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

    public void setLogincommandbutton(HtmlCommandButton logincommandbutton) {
        this.logincommandbutton = logincommandbutton;
    }

    public HtmlCommandButton getLogincommandbutton() {
        return logincommandbutton;
    }

   
}
