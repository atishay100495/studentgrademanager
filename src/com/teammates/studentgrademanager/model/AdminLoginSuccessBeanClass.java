package com.teammates.studentgrademanager.model;

import com.teammates.studentgrademanager.service.IStudentServiceFacade;

import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlOutputText;

public class AdminLoginSuccessBeanClass {
    private HtmlOutputLabel studentidlabel;
    private HtmlInputText studentidbox;
    private HtmlCommandLink viewallstudentscommandlink;
    private HtmlCommandButton updatestudentdetailscommandbutton;
    private HtmlOutputText adminloginsuccesslabel;
    private HtmlCommandButton deleterecordcommandbutton;
    private HtmlInputText sortfieldbox;

    public AdminLoginSuccessBeanClass() {
    }

    
    public Object viewallstudents_action() {
        // Add event code here...
        String sortfield = sortfieldbox.getValue().toString();
        
        return "ViewStudentDetails";
        
    }
    
    public Object updatestudentdetails_action() {
        // Add event code here...
        String studentID = studentidbox.getValue().toString();
        StudentIDInfo.setStudentID(studentID);
        
        return "UpdateStudentDetails";
    }
    
    public Object deleterecord_action() {
        // Add event code here...
        String studentID = studentidbox.getValue().toString();
        IStudentServiceFacade facade = new StudentServiceFacadeImpl();
        facade.deleteRecord(studentID);
        
        return null;
    }

    public void setStudentidlabel(HtmlOutputLabel studentidlabel) {
        this.studentidlabel = studentidlabel;
    }

    public HtmlOutputLabel getStudentidlabel() {
        return studentidlabel;
    }

    public void setStudentidbox(HtmlInputText studentidbox) {
        this.studentidbox = studentidbox;
    }

    public HtmlInputText getStudentidbox() {
        return studentidbox;
    }

 

    public void setViewallstudentscommandlink(HtmlCommandLink viewallstudentscommandlink) {
        this.viewallstudentscommandlink = viewallstudentscommandlink;
    }

    public HtmlCommandLink getViewallstudentscommandlink() {
        return viewallstudentscommandlink;
    }

    public void setUpdatestudentdetailscommandbutton(HtmlCommandButton updatestudentdetailscommandbutton) {
        this.updatestudentdetailscommandbutton = updatestudentdetailscommandbutton;
    }

    public HtmlCommandButton getUpdatestudentdetailscommandbutton() {
        return updatestudentdetailscommandbutton;
    }

    public void setAdminloginsuccesslabel(HtmlOutputText adminloginsuccesslabel) {
        this.adminloginsuccesslabel = adminloginsuccesslabel;
    }

    public HtmlOutputText getAdminloginsuccesslabel() {
        return adminloginsuccesslabel;
    }


    public void setDeleterecordcommandbutton(HtmlCommandButton deleterecordcommandbutton) {
        this.deleterecordcommandbutton = deleterecordcommandbutton;
    }

    public HtmlCommandButton getDeleterecordcommandbutton() {
        return deleterecordcommandbutton;
    }


    public void setSortfieldbox(HtmlInputText sortfieldbox) {
        this.sortfieldbox = sortfieldbox;
    }

    public HtmlInputText getSortfieldbox() {
        return sortfieldbox;
    }
}
