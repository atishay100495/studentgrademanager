package com.teammates.studentgrademanager.model;


public class StudentData {
    public StudentData() {
        super();
    }

    //private int studentID;
    //private Name studentName;
    private String firstname;
    private String lastname;
    private String studentGender;
    private String collegeID;
    private String studentEmail;
    private String studentBranch;
    //private Address studentAddress;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String pincode;
    //private PhoneNumber studentPhone;
    private String studentPhone;
    private double studentPercentMarks;
    private String studentPassword;


    //    public void setStudentID(int studentID) {
    //        this.studentID = studentID;
    //    }
    //
    //    public int getStudentID() {
    //        return studentID;
    //    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
    }

    public String getCollegeID() {
        return collegeID;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine2() {
        return addressLine2;
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

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPercentMarks(double studentPercentMarks) {
        this.studentPercentMarks = studentPercentMarks;
    }

    public double getStudentPercentMarks() {
        return studentPercentMarks;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentPassword() {
        return studentPassword;
    }
}
