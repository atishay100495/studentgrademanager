package com.teammates.studentgrademanager.model;


public class Student {
    public Student() {
        super();
    }

    //private int studentID;
    private Name studentName;
    private String studentGender;
    private String collegeID;
    private String studentEmail;
    private String studentBranch;
    private Address studentAddress;
    private PhoneNumber studentPhone;
    private double studentPercentMarks;
    private String studentPassword;


    //    public void setStudentID(int studentID) {
    //        this.studentID = studentID;
    //    }
    //
    //    public int getStudentID() {
    //        return studentID;
    //    }

    public void setStudentName(Name studentName) {
        this.studentName = studentName;
    }

    public Name getStudentName() {
        return studentName;
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

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentPhone(PhoneNumber studentPhone) {
        this.studentPhone = studentPhone;
    }

    public PhoneNumber getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPercentMarks(double studentPercentMarks) {
        this.studentPercentMarks = studentPercentMarks;
    }

    public double getStudentPercentMarks() {
        return studentPercentMarks;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentPassword() {
        return studentPassword;
    }
}
