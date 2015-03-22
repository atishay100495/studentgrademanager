package com.teammates.studentgrademanager.service;


import com.teammates.studentgrademanager.model.StudentData;

import java.sql.Connection;

import java.util.List;


public interface IStudentServiceFacade {
    public boolean login(String username, String password);
    public boolean register(StudentData studentData);
    public boolean update(StudentData studentData, String studentID);
    public List<StudentData> getStudentDetails();
    public List<StudentData> getStudentDetailsSortBy(String sortField);
    public StudentData getStudentDetailsByStudentID(String studentID);
    //public void setConnectionJNDI(Connection conn);
    public void deleteRecord(String studentID);
}
