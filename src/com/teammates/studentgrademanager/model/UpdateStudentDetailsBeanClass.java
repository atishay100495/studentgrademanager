package com.teammates.studentgrademanager.model;

import com.teammates.studentgrademanager.service.IStudentServiceFacade;
import com.teammates.studentgrademanager.service.StudentServiceFacadeImpl;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlSelectOneMenu;

public class UpdateStudentDetailsBeanClass {
    private HtmlOutputLabel toplabel;
    private HtmlPanelGrid panelGridTop;
    private HtmlOutputLabel firstnamelabel;
    private HtmlInputText firstnamebox;
    private HtmlOutputLabel lastnamelabel;
    private HtmlInputText lastnamebox;
    private HtmlOutputLabel genderlabel;
    private HtmlOutputLabel collegeidlabel;
    private HtmlOutputLabel emaillabel;
    private HtmlOutputLabel branchlabel;
    private HtmlOutputLabel addressline1label;
    private HtmlOutputLabel addressline2label;
    private HtmlOutputLabel citylabel;
    private HtmlOutputLabel statelabel;
    private HtmlOutputLabel pincodelabel;
    private HtmlOutputLabel phonelabel;
    private HtmlOutputLabel percentmarkslabel;
    private HtmlOutputLabel passwordlabel;
    private HtmlOutputLabel confirmpasswordlabel;
    private HtmlInputText collegeidbox;
    private HtmlInputText emailbox;
    private HtmlInputText branchbox;
    private HtmlInputText addressline1box;
    private HtmlInputText addressline2box;
    private HtmlInputText statebox;
    private HtmlInputText pincodebox;
    private HtmlInputText phonebox;
    private HtmlInputText percentmarksbox;
    private HtmlCommandButton registercommandbutton;
    private HtmlSelectOneMenu genderdropdownmenu;
    private HtmlSelectOneMenu citydropdownmenu;
    private HtmlPanelGrid panelgridmiddle;
    private HtmlPanelGrid panelgridbottom;
    private HtmlInputText passwordinputbox;
    private HtmlInputSecret confirmpasswordinputsecret;
    
    private String studentID;
    private String firstname;
    private String lastname;
    private String gender;
    private String collegeid;
    private String email;
    private String branch;
    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String pincode;
    private String phone;
    private String percentmarks;
    private String password;

    IStudentServiceFacade facade = new StudentServiceFacadeImpl();
    public UpdateStudentDetailsBeanClass() {
        //intialize data in form from database
        //Get studentID
        studentID = StudentIDInfo.getStudentID();
        System.out.println(studentID);
        //fetch details using studentID
        StudentData studentDataTemp = facade.getStudentDetailsByStudentID(studentID);
        firstname = studentDataTemp.getFirstname();
        lastname = studentDataTemp.getLastname();
        gender = studentDataTemp.getStudentGender();
        collegeid = studentDataTemp.getCollegeID();
        email = studentDataTemp.getStudentEmail();
        branch = studentDataTemp.getStudentBranch();
        addressline1 = studentDataTemp.getAddressLine1();
        addressline2 = studentDataTemp.getAddressLine2();
        city = studentDataTemp.getCity();
        state = studentDataTemp.getState();
        pincode = studentDataTemp.getPincode();
        phone = studentDataTemp.getStudentPhone();
        percentmarks = String.valueOf(studentDataTemp.getStudentPercentMarks());
        password = studentDataTemp.getStudentPassword();
    }

    public Object registercommandbutton_action() {
        // Add event code here...
        String firstname = firstnamebox.getValue().toString();
        String lastname = lastnamebox.getValue().toString();
        String gender = genderdropdownmenu.getValue().toString();
        String collegeID = collegeidbox.getValue().toString();
        String email = emailbox.getValue().toString();
        String branch = branchbox.getValue().toString();
        String addressLine1 = addressline1box.getValue().toString();
        String addressLine2 = addressline2box.getValue().toString();
        String city = citydropdownmenu.getValue().toString();
        String state = statebox.getValue().toString();
        String pincode = pincodebox.getValue().toString();
        String phone = phonebox.getValue().toString();
        Double percentMarks = Double.parseDouble(percentmarksbox.getValue().toString());
        String password = passwordinputbox.getValue().toString();
        
        StudentData studentData = new StudentData();
        studentData.setFirstname(firstname);
        studentData.setLastname(lastname);
        studentData.setStudentGender(gender);
        studentData.setCollegeID(collegeID);
        studentData.setStudentEmail(email);
        studentData.setStudentBranch(branch);
        studentData.setAddressLine1(addressLine1);
        studentData.setAddressLine2(addressLine2);
        studentData.setCity(city);
        studentData.setState(state);
        studentData.setPincode(pincode);
        studentData.setStudentPhone(phone);
        studentData.setStudentPercentMarks(percentMarks);
        studentData.setStudentPassword(password);
        
        
        //insert into database using JNDI and JPA
        
        boolean result = facade.update(studentData, studentID);
        
        if(result==true)
        {
            return "successUpdate";
        }
        else {
            return "failUpdate";
        }
      
    }

    public void setToplabel(HtmlOutputLabel toplabel) {
        this.toplabel = toplabel;
    }

    public HtmlOutputLabel getToplabel() {
        return toplabel;
    }

    public void setPanelGridTop(HtmlPanelGrid panelGridTop) {
        this.panelGridTop = panelGridTop;
    }

    public HtmlPanelGrid getPanelGridTop() {
        return panelGridTop;
    }

    public void setFirstnamelabel(HtmlOutputLabel firstnamelabel) {
        this.firstnamelabel = firstnamelabel;
    }

    public HtmlOutputLabel getFirstnamelabel() {
        return firstnamelabel;
    }

    public void setFirstnamebox(HtmlInputText firstnamebox) {
        this.firstnamebox = firstnamebox;
    }

    public HtmlInputText getFirstnamebox() {
        return firstnamebox;
    }

    public void setLastnamelabel(HtmlOutputLabel lastnamelabel) {
        this.lastnamelabel = lastnamelabel;
    }

    public HtmlOutputLabel getLastnamelabel() {
        return lastnamelabel;
    }

    public void setLastnamebox(HtmlInputText lastnamebox) {
        this.lastnamebox = lastnamebox;
    }

    public HtmlInputText getLastnamebox() {
        return lastnamebox;
    }

    public void setGenderlabel(HtmlOutputLabel genderlabel) {
        this.genderlabel = genderlabel;
    }

    public HtmlOutputLabel getGenderlabel() {
        return genderlabel;
    }

    public void setCollegeidlabel(HtmlOutputLabel collegeidlabel) {
        this.collegeidlabel = collegeidlabel;
    }

    public HtmlOutputLabel getCollegeidlabel() {
        return collegeidlabel;
    }

    public void setEmaillabel(HtmlOutputLabel emaillabel) {
        this.emaillabel = emaillabel;
    }

    public HtmlOutputLabel getEmaillabel() {
        return emaillabel;
    }

    public void setBranchlabel(HtmlOutputLabel branchlabel) {
        this.branchlabel = branchlabel;
    }

    public HtmlOutputLabel getBranchlabel() {
        return branchlabel;
    }

    public void setAddressline1label(HtmlOutputLabel addressline1label) {
        this.addressline1label = addressline1label;
    }

    public HtmlOutputLabel getAddressline1label() {
        return addressline1label;
    }

    public void setAddressline2label(HtmlOutputLabel addressline2label) {
        this.addressline2label = addressline2label;
    }

    public HtmlOutputLabel getAddressline2label() {
        return addressline2label;
    }

    public void setCitylabel(HtmlOutputLabel citylabel) {
        this.citylabel = citylabel;
    }

    public HtmlOutputLabel getCitylabel() {
        return citylabel;
    }

    public void setStatelabel(HtmlOutputLabel statelabel) {
        this.statelabel = statelabel;
    }

    public HtmlOutputLabel getStatelabel() {
        return statelabel;
    }

    public void setPincodelabel(HtmlOutputLabel pincodelabel) {
        this.pincodelabel = pincodelabel;
    }

    public HtmlOutputLabel getPincodelabel() {
        return pincodelabel;
    }

    public void setPhonelabel(HtmlOutputLabel phonelabel) {
        this.phonelabel = phonelabel;
    }

    public HtmlOutputLabel getPhonelabel() {
        return phonelabel;
    }

    public void setPercentmarkslabel(HtmlOutputLabel percentmarkslabel) {
        this.percentmarkslabel = percentmarkslabel;
    }

    public HtmlOutputLabel getPercentmarkslabel() {
        return percentmarkslabel;
    }

    public void setPasswordlabel(HtmlOutputLabel passwordlabel) {
        this.passwordlabel = passwordlabel;
    }

    public HtmlOutputLabel getPasswordlabel() {
        return passwordlabel;
    }

    public void setConfirmpasswordlabel(HtmlOutputLabel confirmpasswordlabel) {
        this.confirmpasswordlabel = confirmpasswordlabel;
    }

    public HtmlOutputLabel getConfirmpasswordlabel() {
        return confirmpasswordlabel;
    }

    public void setCollegeidbox(HtmlInputText collegeidbox) {
        this.collegeidbox = collegeidbox;
    }

    public HtmlInputText getCollegeidbox() {
        return collegeidbox;
    }

    public void setEmailbox(HtmlInputText emailbox) {
        this.emailbox = emailbox;
    }

    public HtmlInputText getEmailbox() {
        return emailbox;
    }

    public void setBranchbox(HtmlInputText branchbox) {
        this.branchbox = branchbox;
    }

    public HtmlInputText getBranchbox() {
        return branchbox;
    }

    public void setAddressline1box(HtmlInputText addressline1box) {
        this.addressline1box = addressline1box;
    }

    public HtmlInputText getAddressline1box() {
        return addressline1box;
    }

    public void setAddressline2box(HtmlInputText addressline2box) {
        this.addressline2box = addressline2box;
    }

    public HtmlInputText getAddressline2box() {
        return addressline2box;
    }

    public void setStatebox(HtmlInputText statebox) {
        this.statebox = statebox;
    }

    public HtmlInputText getStatebox() {
        return statebox;
    }

    public void setPincodebox(HtmlInputText pincodebox) {
        this.pincodebox = pincodebox;
    }

    public HtmlInputText getPincodebox() {
        return pincodebox;
    }

    public void setPhonebox(HtmlInputText phonebox) {
        this.phonebox = phonebox;
    }

    public HtmlInputText getPhonebox() {
        return phonebox;
    }

    public void setPercentmarksbox(HtmlInputText percentmarksbox) {
        this.percentmarksbox = percentmarksbox;
    }

    public HtmlInputText getPercentmarksbox() {
        return percentmarksbox;
    }

    public void setRegistercommandbutton(HtmlCommandButton registercommandbutton) {
        this.registercommandbutton = registercommandbutton;
    }

    public HtmlCommandButton getRegistercommandbutton() {
        return registercommandbutton;
    }



    public void setGenderdropdownmenu(HtmlSelectOneMenu genderdropdownmenu) {
        this.genderdropdownmenu = genderdropdownmenu;
    }

    public HtmlSelectOneMenu getGenderdropdownmenu() {
        return genderdropdownmenu;
    }

    public void setCitydropdownmenu(HtmlSelectOneMenu citydropdownmenu) {
        this.citydropdownmenu = citydropdownmenu;
    }

    public HtmlSelectOneMenu getCitydropdownmenu() {
        return citydropdownmenu;
    }

    public void setPanelgridmiddle(HtmlPanelGrid panelgridmiddle) {
        this.panelgridmiddle = panelgridmiddle;
    }

    public HtmlPanelGrid getPanelgridmiddle() {
        return panelgridmiddle;
    }

    public void setPanelgridbottom(HtmlPanelGrid panelgridbottom) {
        this.panelgridbottom = panelgridbottom;
    }

    public HtmlPanelGrid getPanelgridbottom() {
        return panelgridbottom;
    }

    public void setPasswordinputbox(HtmlInputText passwordinputbox) {
        this.passwordinputbox = passwordinputbox;
    }

    public HtmlInputText getPasswordinputbox() {
        return passwordinputbox;
    }

    public void setConfirmpasswordinputsecret(HtmlInputSecret confirmpasswordinputsecret) {
        this.confirmpasswordinputsecret = confirmpasswordinputsecret;
    }

    public HtmlInputSecret getConfirmpasswordinputsecret() {
        return confirmpasswordinputsecret;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid;
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPercentmarks(String percentmarks) {
        this.percentmarks = percentmarks;
    }

    public String getPercentmarks() {
        return percentmarks;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setFacade(IStudentServiceFacade facade) {
        this.facade = facade;
    }

    public IStudentServiceFacade getFacade() {
        return facade;
    }
}
