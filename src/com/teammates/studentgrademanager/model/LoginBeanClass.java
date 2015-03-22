package com.teammates.studentgrademanager.model;


import com.teammates.studentgrademanager.service.IStudentServiceFacade;
import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlPanelGrid;


public class LoginBeanClass {
    private HtmlCommandButton commandButton1;
    private HtmlCommandButton commandButton2;
    private HtmlPanelGrid panelGrid1;
    private HtmlInputSecret inputSecret1;
    private HtmlOutputLabel outputLabel1;
    private HtmlPanelGrid panelGrid2;
    private HtmlInputText inputText1;
    private HtmlOutputLabel outputLabel2;
    private HtmlPanelGrid panelGrid3;
    private HtmlForm form1;
    private HtmlForm form2;

    public LoginBeanClass() {
    }

    public Object commandButton_action() {
        // Add event code here...
        String username = inputText1.getValue().toString();
        String password = inputSecret1.getValue().toString();
        
        //Use JNDI Lookup
        //Hashtable env = new Hashtable();
        //env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        //env.put(Context.PROVIDER_URL, "t3://localhost:7101");
        //Context context;
        try {
            //context = new InitialContext(env); //takes to jndi tree in application server
            //DataSource dataSource = (DataSource)context.lookup("JDBC/DataSource1");
            //Connection connection = dataSource.getConnection();
            
            IStudentServiceFacade facade = new StudentServiceFacadeImpl();
            //facade.setConnectionJNDI(connection);
            boolean result = facade.login(username, password);
            
            if(result==true)
            {
                return "success";
            }
            else {
                return "fail";
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "fail";
    }

    public void setCommandButton1(HtmlCommandButton commandButton1) {
        this.commandButton1 = commandButton1;
    }

    public HtmlCommandButton getCommandButton1() {
        return commandButton1;
    }

    public void setCommandButton2(HtmlCommandButton commandButton2) {
        this.commandButton2 = commandButton2;
    }

    public HtmlCommandButton getCommandButton2() {
        return commandButton2;
    }

    public void setPanelGrid1(HtmlPanelGrid panelGrid1) {
        this.panelGrid1 = panelGrid1;
    }

    public HtmlPanelGrid getPanelGrid1() {
        return panelGrid1;
    }

    public void setInputSecret1(HtmlInputSecret inputSecret1) {
        this.inputSecret1 = inputSecret1;
    }

    public HtmlInputSecret getInputSecret1() {
        return inputSecret1;
    }

    public void setOutputLabel1(HtmlOutputLabel outputLabel1) {
        this.outputLabel1 = outputLabel1;
    }

    public HtmlOutputLabel getOutputLabel1() {
        return outputLabel1;
    }

    public void setPanelGrid2(HtmlPanelGrid panelGrid2) {
        this.panelGrid2 = panelGrid2;
    }

    public HtmlPanelGrid getPanelGrid2() {
        return panelGrid2;
    }

    public void setInputText1(HtmlInputText inputText1) {
        this.inputText1 = inputText1;
    }

    public HtmlInputText getInputText1() {
        return inputText1;
    }

    public void setOutputLabel2(HtmlOutputLabel outputLabel2) {
        this.outputLabel2 = outputLabel2;
    }

    public HtmlOutputLabel getOutputLabel2() {
        return outputLabel2;
    }

    public void setPanelGrid3(HtmlPanelGrid panelGrid3) {
        this.panelGrid3 = panelGrid3;
    }

    public HtmlPanelGrid getPanelGrid3() {
        return panelGrid3;
    }

    public void setForm1(HtmlForm form1) {
        this.form1 = form1;
    }

    public HtmlForm getForm1() {
        return form1;
    }

    public void setForm2(HtmlForm form2) {
        this.form2 = form2;
    }

    public HtmlForm getForm2() {
        return form2;
    }
}
