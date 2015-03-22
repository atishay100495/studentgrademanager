package com.teammates.studentgrademanager.model;

public class StudentIDInfo {
    public StudentIDInfo() {
        super();
    }
    
    private static String studentID;


    public static void setStudentID(String studentEmailID) {
        StudentIDInfo.studentID = studentEmailID;
    }

    public static String getStudentID() {
        return studentID;
    }
}
